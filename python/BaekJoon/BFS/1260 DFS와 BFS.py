from collections import deque

def dfs(start, visited, graph):
    visited[start] = True
    print(start, end=' ')

    for node in graph[start]:
        if not visited[node]:
            dfs(node, visited, graph)

def bfs(start, visited, graph):
    queue = deque([start])
    visited[start] = True
    print(start, end=' ')

    while queue:
        cur_node = queue.popleft()
        for neighbor in graph[cur_node]:
            if not visited[neighbor]:
                queue.append(neighbor)
                visited[neighbor] = True
                print(neighbor, end=' ')
    

n, m, v = map(int, input().split())
graph = [[] for _ in range(n+1)] # 인접 리스트
for _ in range(m):
    node1, node2 = map(int, input().split())
    graph[node1].append(node2)
    graph[node2].append(node1)

for neighbors in graph:
    neighbors.sort()

visited = [False] * (n+1)
dfs(v, visited, graph)
print()
visited = [False] * (n+1)
bfs(v, visited, graph)
