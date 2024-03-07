from collections import deque

n = int(input())
a, b = map(int, input().split())
m = int(input())

graph = [[] for _ in range(n+1)] # 0, 1 - n까지
for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

def dfs(start, target, visited):
    q = deque([start])
    visited[start] = 1
    while q:
        cur = q.popleft()
        if cur == target:
            return visited[cur]
        for next in graph[cur]:
            if not visited[next]:
                visited[next] = visited[cur] + 1
                q.append(next)
    return -1

visited = [0] * (n+1)
ans = -1
for i in range(1, n+1):
    if not visited[i]:
        ans = dfs(a, b, visited)
        if ans != -1:
            break
if ans == -1:
    print(-1)
else:
    print(ans-1)