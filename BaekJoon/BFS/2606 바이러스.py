from collections import deque

n = int(input()) # 컴퓨터의 수
m = int(input()) # 네트워크에 직접 연결된 컴퓨터 쌍의 수

graph = [[] for _ in range(n+1)] # 0번은 사용하지 않음
visited = [False] * (n+1) # 0번은 사용하지 않음
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def bfs(start, graph, visited):
    q = deque([start])
    visited[start] = True
    cnt = 0 # 1번 컴퓨터를 '통해' 걸리는 컴퓨터의 수

    while q:
        cur = q.popleft()
        for node in graph[cur]:
            if not visited[node]:
                q.append(node)
                visited[node] = True
                cnt += 1
    return cnt

print(bfs(1, graph, visited))
