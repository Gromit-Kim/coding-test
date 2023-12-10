from collections import deque

n = int(input())
graph = []
for i in range(n):
    graph.append(list(map(int, input())))
visited = [[False] * n for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(sx, sy, graph, visited):
    q = deque([(sx, sy)])
    visited[sx][sy] = True
    home_cnt = 1

    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            if graph[nx][ny] == 1 and not visited[nx][ny]:
                q.append((nx, ny))
                visited[nx][ny] = True
                home_cnt += 1
    return home_cnt

danji = []
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1 and not visited[i][j]:
            danji.append(bfs(i, j, graph, visited))

print(len(danji))
for home_cnt in sorted(danji):
    print(home_cnt)