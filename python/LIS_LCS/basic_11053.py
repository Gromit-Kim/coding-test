#     10  20  10  30  20  50
# DP  1   2   1   2   1   3
# 나보자 작은 숫자가 왼쪽에 있냐?
# 있다면 나보다 가장 작은 친구 중 가장 큰 값 + 1

n = int(input())
arr = list(map(int, input().split()))

dp = [1 for _ in range(n)]

for i in range(n):
    for j in range(i):
        if arr[j] < arr[i]:
            dp[i] = max(dp[i], dp[j] + 1)

print(max(dp))