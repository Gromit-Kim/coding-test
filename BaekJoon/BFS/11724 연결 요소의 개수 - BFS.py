import sys
from collections import deque
input = sys.stdin.readline

N, M = map(int, input().split())
adj = [[False] *(N+1) for _ in range(N+1)]
for _ in range(M):
    a, b = map(int, input().split())
    adj[a][b] = adj[b][a] = True

ans = 0
visited = [False] * (N+1)

def bfs(node):
    q = deque()
    q.append(node)
    while len(q):
        cur = q.popleft()
        for i in range(1, N+1):
            if adj[cur][i] and not visited[i]:
                visited[i] = True
                q.append(i)

for i in range(1, N+1):
    if not visited[i]:
        ans += 1
        visited[i] = True
        bfs(i)
print(ans)