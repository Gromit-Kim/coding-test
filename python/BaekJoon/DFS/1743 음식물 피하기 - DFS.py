import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

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

def dfs(y, x):
    if not (0 <= x < M and 0 <= y < N) or visited[y][x] or not board[y][x]:
        return 0
    
    visited[y][x] = True
    cnt = 1
    for i in range(4):
        ny, nx = y + dy[i], x + dx[i]
        cnt += dfs(ny, nx)
    return cnt

ans = 0
for sy, sx in start_point:
    if not visited[sy][sx]:
        ans = max(ans, dfs(sy, sx))
print(ans)