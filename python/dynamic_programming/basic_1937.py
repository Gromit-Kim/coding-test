import sys
sys.setrecursionlimit(int(1e9))
# def recur(y, x):
#     point = 0
#     for dx, dy in [(1,0), (-1,0), (0,1), (0,-1)]:
#         nx = x + dx
#         ny = y + dy
#         if 0 <= nx < n and 0 <= ny < n:
#             if graph[x][y] < graph[nx][ny]:
#                 point = max(point, recur(nx, ny) + 1)
#     return point
# 
# n = int(input())
# graph = [list(map(int, input().split())) for _ in range(n)]
# answer = 0
# for sy in range(n):
#     for sx in range(n):
#         cnt = recur(sx, sy)
#         answer = max(answer, cnt)
# print(answer)

# [DP]
def opti_recur(y, x):
    if dp[y][x] != 0:
        return dp[y][x]
    
    for dx, dy in [(1,0), (-1,0), (0,1), (0,-1)]:
        ny = y + dy
        nx = x + dx

        if 0 <= ny < n and 0 <= nx < n:
            if graph[y][x] < graph[ny][nx]:
                dp[y][x] = max(dp[y][x], opti_recur(ny, nx) + 1)

    return dp[y][x]

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]
dp = [[0 for _ in range(n)] for _ in range(n)] # dp[y][x]: y,x에서 시작했을 때 갈 수 있는 최대 경로 길이
for sy in range(n):
    for sx in range(n):
        opti_recur(sy, sx)
print(max(map(max, dp)) + 1)

