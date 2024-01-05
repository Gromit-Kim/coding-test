## 시간 초과 발생!!!!

import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

def is_valid_coord(y, x, l):
    return 0 <= y < l and 0 <= x < l

dx = [-2, -1, 1, 2, 2, 1, -1, -2]
dy = [-1, -2, -2, -1, 1, 2, 2, 1]

def dfs(y, x, end_y, end_x, visited, l, depth):
    if y == end_y and x == end_x:
        return depth
    
    visited[y][x] = True
    min_distance = 1000000
    for i in range(8):
        ny, nx = y + dy[i], x + dx[i]
        if is_valid_coord(ny, nx, l) and not visited[ny][nx]:
            distance = dfs(ny, nx, end_y, end_x, visited, l, depth + 1)
            min_distance = min(min_distance, distance)
    visited[y][x] = False # backtracking
    return min_distance

def run():
    l = int(input().rstrip())
    visited = [[False] * l for _ in range(l)]
    start_y, start_x = map(int, input().split())
    end_y, end_x = map(int, input().split())
    result = dfs(start_y, start_x, end_y, end_x, visited, l, 0)
    print(result)

T = int(input())
for _ in range(T):
    run()