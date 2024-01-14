from collections import deque
dy = [-1, 1, 0, 0]
dx = [0, 0, -1, 1]
def dfs(y, x, board, visited, n, m, cnt):
    if y == n-1 and x == m-1:
        return cnt
    visited[y][x] = True
    min_cnt = float('inf')
    for i in range(4):
        ny, nx = y + dy[i], x + dx[i]
        if nx < 0 or nx >= m or ny < 0 or ny >= n:
            continue
        if board[ny][nx] == 0 or visited[ny][nx] != 0:
            continue
        min_cnt = min(min_cnt, dfs(ny, nx, board, visited, n, m, cnt+1))
    visited[y][x] = False
    return min_cnt if min_cnt != float('inf') else None

def solution(maps):
    n = len(maps)
    m = len(maps[0])
    visited = [[False] * m for _ in range(n)]
    res = dfs(0, 0, maps, visited, n, m, 1)
    return -1 if res is None else res