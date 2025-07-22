import sys
input = sys.stdin.readline

# def recur(i, j):
#     if i == j:
#         return 0
#     if dp[i][j] != -1:
#         return dp[i][j]
    
#     dp[i][j] = int(1e9)
#     for k in range(i, j):
#         cost = recur(i, k) + recur(k+1, j) + dims[i] * dims[k+1] * dims[j+1]
#         dp[i][j] = min(dp[i][j], cost)

#     return dp[i][j]

n = int(input())
mats = [tuple(map(int, input().split())) for _ in range(n)]

dims = [mats[0][0]] + [c for _, c in mats]

# dp = [[-1] * n for _ in range(n)]
# print(recur(0, n-1))
dp = [[0] * n for _ in range(n)]
for length in range(2, n+1):
    for i in range(n - length + 1):
        j = i + length -1
        dp[i][j] = int(1e9)
        for k in range(i, j):
            cost = dp[i][k] + dp[k+1][j] + dims[i] * dims[k+1] * dims[j+1]
            dp[i][j] = min(cost, dp[i][j])
print(dp[0][n-1])