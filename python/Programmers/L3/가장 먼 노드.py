from collections import deque
def bfs(start, visited, graph):
    q = deque([start])
    visited[start] = 1
    while q:
        v = q.popleft()
        for nv in graph[v]:
            if not visited[nv]:
                visited[nv] = visited[v] + 1
                q.append(nv)

def solution(n, edge):
    visited = [0] * (n+1)
    graph = [[] for _ in range(n+1)]
    for a, b in edge:
        graph[a].append(b)
        graph[b].append(a)
    bfs(1, visited, graph)
    print(visited)
    return visited.count(max(visited))

print(solution(6, [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]))