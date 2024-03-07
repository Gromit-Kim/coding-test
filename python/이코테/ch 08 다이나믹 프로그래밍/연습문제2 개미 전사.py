n = int(input())
foods = list(map(int, input().split()))
dp = [0] * 100 # dp[i]  : i 번째 식량창고까지 최적의 해

dp[0] = foods[0]
dp[1] = max(foods[0], foods[1])
for i in range(2, n):
    dp[i] = max(dp[i-1], dp[i-2] + foods[i])
print(dp[n-1])
