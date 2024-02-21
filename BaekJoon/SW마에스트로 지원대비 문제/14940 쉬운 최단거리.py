from collections import deque
import sys
input = sys.stdin.readline

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

n, m = map(int, input().split()) # n : 세로, m : 가로
visited = [[-1] * m for _ in range(n)]
board = []
sy, sx = 0, 0
for i in range(n):
    row = list(map(int, input().split()))
    board.append(row)
    for j in range(m):
        if row[j] == 2:
            sy, sx = i, j
        if row[j] == 0:
            visited[i][j] = 0
    
def bfs(sy, sx, visited, board):
    q = deque([(sy, sx)])
    visited[sy][sx] = 0
    while q:
        y, x = q.popleft()
        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            if ny < 0 or ny >= n or nx < 0 or nx >= m:
                continue
            if board[ny][nx] == 1 and visited[ny][nx] == -1:
                visited[ny][nx] = visited[y][x] + 1
                q.append((ny, nx))

bfs(sy, sx, visited, board)
for row in visited:
    print(' '.join(map(str, row)))