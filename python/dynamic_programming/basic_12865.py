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
dp = [[-1 for _ in range(100_001)] for _ in range(a)] # dp[i][j]: i번째 물건일 때 j 무게일 때 가치?
recur(0, 0)
print(max(dp))
