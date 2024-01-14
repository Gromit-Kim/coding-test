from collections import deque
dy = [-1, 1, 0, 0]
dx = [0, 0, -1, 1]
def bfs(sy, sx, board, visited, n, m):
    q = deque([(sy, sx)])
    visited[sy][sx] = 1
    while q:
        y, x = q.popleft()
        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            if nx < 0 or nx >= m or ny < 0 or ny >= n:
                continue
            if board[ny][nx] == 0 or visited[ny][nx] != 0:
                continue
            q.append((ny, nx))
            visited[ny][nx] = visited[y][x] + 1

def solution(maps):
    n = len(maps)
    m = len(maps[0])
    visited = [[0] * m for _ in range(n)]
    bfs(0, 0, maps, visited, n, m)
    return -1 if visited[n-1][m-1] == 0 else visited[n-1][m-1]