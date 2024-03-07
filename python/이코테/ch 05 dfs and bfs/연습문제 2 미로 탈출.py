from collections import deque
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int, input().split())))
visited = [[0] * m for _ in range(n)]

def bfs(x, y, visited):
    q = deque()
    q.append((x, y))
    visited[x][y] = 1
    while q:
        cur_x, cur_y = q.popleft()
        for i in range(4):
            nx, ny = cur_x + dx[i], cur_y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if graph[nx][ny] == 0:
                continue
            if not visited[nx][ny]:
                visited[nx][ny] = visited[cur_x][cur_y] + 1
                q.append((nx, ny))
    return visited[n-1][m-1]

print(bfs(0, 0, visited))