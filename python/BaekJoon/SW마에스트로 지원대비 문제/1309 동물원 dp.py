n = int(input())
dp = [[0, 0, 0] for _ in range(2)]
for i in range(3):
    dp[1][i] = 1
for i in range(2, n + 1):
    dp[i % 2][0] = (dp[(i - 1) % 2][0] + dp[(i - 1) % 2][1] + dp[(i - 1) % 2][2]) % 9901
    dp[i % 2][1] = (dp[(i - 1) % 2][0] + dp[(i - 1) % 2][2]) % 9901
    dp[i % 2][2] = (dp[(i - 1) % 2][0] + dp[(i - 1) % 2][1]) % 9901
print(sum(dp[n % 2]) % 9901)
