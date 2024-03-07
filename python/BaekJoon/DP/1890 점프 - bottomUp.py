import sys
input = sys.stdin.readline

n = int(input())
board = [list(map(int, input().split())) for _ in range(n)]
dp = [[0] * n for _ in range(n)] # dp[i][j] = (i, j)까지 오는 경우의 수
dp[0][0] = 1

for i in range(n):
    for j in range(n):
        if i == n-1 and j == n-1:
            break
        if dp[i][j] == 0:
            continue
        distance = board[i][j]
        if i + distance < n:
            dp[i+distance][j] += dp[i][j]
        if j + distance < n:
            dp[i][j+distance] += dp[i][j]

print(dp[n-1][n-1])