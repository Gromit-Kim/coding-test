from collections import deque

R, C = map(int, input().split())
board = [list(input()) for _ in range(R)]
visited = [[set() for _ in range(C)] for _ in range(R)]

dx = [0, 0, -1, 1] # 상하좌우
dy = [-1, 1, 0, 0]

def is_valid_coord(y, x):
    return 0 <= y < R and 0 <= x < C

def bfs(sy, sx, before):
    q = deque([(sy, sx, before)])
    visited[sy][sx].add(before)

    max_res = 0
    while q:
        y, x, path = q.popleft()
        max_res = max(max_res, len(path))
        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            if is_valid_coord(ny, nx) and board[ny][nx] not in path:
                n_path = path + board[ny][nx]
                if n_path not in visited[ny][nx]:
                    visited[ny][nx].add(n_path)
                    q.append((ny, nx, n_path))
    return max_res

print(bfs(0, 0, board[0][0]))