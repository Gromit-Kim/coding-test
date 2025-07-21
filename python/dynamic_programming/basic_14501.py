def recur(idx):
    if dp[idx] != -1:
        return dp[idx]
    if idx == n-1:
        return 0
    if idx > n-1:
        return -int(1e9)
    
    do = recur(idx + consults[idx][0]) + consults[idx][1]
    undo = recur(idx+1)
    dp[idx] = max(do, undo)
    return dp[idx]



n = int(input())
consults = [list(map(int, input().split())) for _ in range(n)]
dp = [-1 for _ in range(n+1)]
recur(0)
print(dp[0])

# Bottom Up - 점화식을 만든다.
# dp = [0 for _ in range(n)]
# for idx in range(n+1)[::-1]:
#     if idx + consults[idx][0] > n:
#         dp[idx] = dp[idx+1] # 넘는 순간 못하게 한것..
#     else:
#         dp[idx] = max(dp[idx + consults[idx][0]] + dp[idx][1], dp[idx+1])