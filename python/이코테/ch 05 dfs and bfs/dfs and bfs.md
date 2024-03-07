## DFS
```Python
def dfs(graph, v, visited):
    visited[v] = True # 1. 현재 노드 방문 처리 
    # 2. 이때 필요한 추갖거인 행위를 한다.
    for next_node in graph[v]: # 3. 이웃 노드들을 반복
        if not visited[v]:
            dfs(graph, next_node, visited) # 방문하지 않은 것을 반복
```

## BFS
```Python
from collections import deque
def bfs(graph, start, visited):
    q = deque([start])
    visited[start] = True
    while q:
        v = q.popleft()
        for next_node in graph[v]:
            if not visited[next_node]:
                q.append(next_node)
```

