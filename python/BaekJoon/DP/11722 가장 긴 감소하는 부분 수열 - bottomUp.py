n = int(input())
arr = list(map(int, input().split()))
dp = [1] * n # dp[i] = arr[i]를 마지막으로 하는 가장 긴 감소하는 부분 수열의 길이

for i in range(1, n):
    for j in range(i):
        if arr[j] > arr[i]:
            dp[i] = max(dp[i], dp[j] + 1)

print(max(dp))