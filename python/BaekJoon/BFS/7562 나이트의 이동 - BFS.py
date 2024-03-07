import sys
from collections import deque
input = sys.stdin.readline

def is_valid_coord(y, x, l):
    return 0 <= y < l and 0 <= x < l

dx = [-2, -1, 1, 2, 2, 1, -1, -2]
dy = [-1, -2, -2, -1, 1, 2, 2, 1]

def bfs(y, x, end_y, end_x, visited, l, distance_board):
    q = deque([(y, x)])
    visited[y][x] = True
    while q:
        cy, cx = q.popleft()
        if cy == end_y and cx == end_x:
            return distance_board[cy][cx]
        
        for i in range(8):
            ny, nx = cy + dy[i], cx + dx[i]
            if is_valid_coord(ny, nx, l) and not visited[ny][nx]:
                visited[ny][nx] = True
                distance_board[ny][nx] = distance_board[cy][cx] + 1
                q.append((ny, nx))

def run():
    l = int(input().rstrip())
    visited = [[False] * l for _ in range(l)]
    distance_board = [[0] * l for _ in range(l)]
    start_y, start_x = map(int, input().split())
    end_y, end_x = map(int, input().split())
    print(bfs(start_y, start_x, end_y, end_x, visited, l, distance_board))

T = int(input())
for _ in range(T):
    run()