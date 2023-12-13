from collections import deque

def bfs(sx, sy, graph, visited):
    q = deque([sx, sy])
    visited[sx][sy] = True

    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if graph[nx][ny] == 1 and not visited[nx][ny]:
                    q.append((nx, ny))
                    visited[nx][ny] = True

t = int(input())
for _ in range(t):
    m, n, k = map(int, input().split()) # 가로, 세로, 배추 개수
    graph = [[0] * m for _ in range(n)]
    visited = [[False] * m for _ in range(n)]
    start_points = []
    for _ in range(k):
        x, y = map(int, input().split())
        graph[y][x] = 1
        start_points.append((y, x))
    
    cnt = 0
    for sx, sy in start_points:
        if not visited[sx][sy]:
            bfs(sx, sy, graph, visited)
            cnt += 1
    print(cnt)