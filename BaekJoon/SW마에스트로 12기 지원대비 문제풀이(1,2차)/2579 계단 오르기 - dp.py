n = int(input())
steps = [int(input()) for _ in range(n)]
steps = [0] + steps
dp = [0] * (n+1)
dp[1] = steps[1]
for i in range(2, n+1):
    dp[i] = steps[i]
    if i == 2:
        dp[i] += steps[i-1]
    else:
        dp[i] += max(dp[i-2], dp[i-3] +steps[i-1])
print(dp[n])
