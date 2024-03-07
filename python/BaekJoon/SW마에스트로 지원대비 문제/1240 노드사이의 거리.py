from collections import deque

def bfs(s, e, visited):
    q = deque([(s, 0)])
    visited[s] = True
    while q:
        cur, dis = q.popleft()
        if cur == e:
            return dis
        for next, next_dis in graph[cur]:
            if not visited[next]:
                visited[next] = True
                q.append((next, dis+next_dis))

n, m = map(int, input().split())
graph = [[] for _ in range(n+1)]
for _ in range(n-1):
    p1, p2, dis = map(int, input().split())
    graph[p1].append((p2, dis))
    graph[p2].append((p1, dis)) # adjacency list

for _ in range(m):
    s, e = map(int, input().split())
    visited = [False] * (n+1)
    print(bfs(s, e, visited))