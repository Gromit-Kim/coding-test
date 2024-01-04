import sys
sys.setrecursionlimit(1000000)
input = sys.stdin.readline

N, M = map(int, input().split())
adj = [[False] *(N+1) for _ in range(N+1)]
for _ in range(M):
    a, b = map(int, input().split())
    adj[a][b] = adj[b][a] = True

ans = 0
visited = [False] * (N+1)

def dfs(node):
    for i in range(1, N+1):
        if adj[node][i] and not visited[i]:
            visited[i] = True
            dfs(i)

for i in range(1, N+1):
    if not visited[i]:
        ans += 1
        visited[i] = True
        dfs(i)
print(ans)