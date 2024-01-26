n = int(input())
arr = list(map(int, input().split()))
dp = [1] * n # dp[i] = arr[i]를 마지막으로 하는 가장 긴 감소하는 부분 수열의 길이

def init_dp(cur, arr):
    if cur == 0:
        return dp[cur]
    for j in range(cur):
        if arr[j] > arr[cur]:
            dp[cur] = max(dp[cur], init_dp(j, arr) + 1)
    return dp[cur]

init_dp(n - 1, arr)
print(max(dp))