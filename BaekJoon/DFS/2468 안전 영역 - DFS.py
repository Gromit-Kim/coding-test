import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())
board = []
m = 0
for _ in range(n):
    tmp = list(map(int, input().split()))
    board.append(tmp)
    m = max(m, max(tmp))

dy = [-1, 1, 0, 0]
dx = [0, 0, -1, 1]

def dfs(y, x, visited, h):
    visited[y][x] = True
    for i in range(4):
        ny, nx = y + dy[i], x + dx[i]
        if ny < 0 or ny >= n or nx < 0 or nx >= n:
            continue
        if not visited[ny][nx] and board[ny][nx] > h:
            dfs(ny, nx, visited, h)
    return 1

cnt = 0
for h in range(m):
    visited = [[False] * n for _ in range(n)]
    new_cnt = 0
    for row in range(n):
        for col in range(n):
            if not visited[row][col] and board[row][col] > h:
                new_cnt += dfs(row, col, visited, h)
    cnt = max(cnt, new_cnt)
print(cnt)