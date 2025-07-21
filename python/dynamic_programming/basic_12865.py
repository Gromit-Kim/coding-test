def recur(idx, weight):
    if dp[idx][weight] != -1:
        return dp[idx][weight]
    if weight > b:
        return -(1e9)
    if idx == a:
        return 0
    
    do = recur(idx+1, weight + items[idx][0]) + items[idx][1]
    undo = recur(idx+1, weight)
    dp[idx][weight] = max(do, undo)
    return dp[idx][weight]

a, b = map(int, input().split())
items = [list(map(int, input().split())) for _ in range(a)]
dp = [[-1 for _ in range(100_001)] for _ in range(a)] # dp[i][j]: i번째 아이템부터 시작해서 무게 j상태에서 선택가능한 최대 가치
recur(0, 0)
print(max(dp))

# Bottom Up

# dp = [[ 0 for _ in range(b)] for _ in range(a)]
# for idx in range(a+1):
#     for weight in range(b+1):
#         if weight < b:
#             dp[idx][weight] = dp[idx-1][weight]
#         else:
#             do = dp[idx-1][weight + items[idx][0]]
#             undo = dp[idx-1][weight]
#             dp[idx][weight] = max(do, undo)