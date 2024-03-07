n = int(input())
m = int(input())
graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(cur, graph, visited):
    visited[cur] = True
    cnt = 0
    for neighbor in graph[cur]:
        if not visited[neighbor]:
            cnt += 1
            cnt += dfs(neighbor, graph, visited)
    return cnt

print(dfs(1, graph, visited))