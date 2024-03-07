import sys
from collections import deque
input = sys.stdin.readline

N, M, K = map(int, input().split())
board = [[0] * M for _ in range(N)]
start_point = []
for _ in range(K):
    r, c = map(int, input().split())
    board[r-1][c-1] = 1 # 음식물 위치
    start_point.append((r-1, c-1))

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
visited = [[False] * M for _ in range(N)]

def bfs(sy, sx):
    q = deque([(sy, sx)])
    visited[sy][sx] = True
    cnt = 1
    while q:
        y, x = q.popleft()
        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            if 0 <= nx < M and 0 <= ny < N and not visited[ny][nx]:
                if board[ny][nx]:
                    q.append((ny, nx))
                    visited[ny][nx] = True
                    cnt += 1
    return cnt

ans = 0
for sy, sx in start_point:
    if not visited[sy][sx]:
        ans = max(ans, bfs(sy, sx))
print(ans)