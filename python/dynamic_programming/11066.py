import sys
# sys.setrecursionlimit(1000000)
input = sys.stdin.readline

# def recur(i, j): # i 번재 부터 j 번째 책까지 합칠 때의 최솟값
#     if i == j:
#         return 0
#     if dp[i][j] != -1:
#         return dp[i][j]
    
#     total = prefix[j+1] - prefix[i]
#     min_cost = int(1e9)
#     for k in range(i, j):
#         min_cost = min(min_cost,recur(i, k)  + recur(k+1, j) + total)

#     dp[i][j] = min_cost
#     return dp[i][j]

T = int(input())
for _ in range(T):
    n = int(input())
    chapters = list(map(int, input().split()))

    prefix = [0] * (n+1)
    for i in range(n):
        prefix[i+1] = prefix[i] + chapters[i]

    dp = [[0] * n for _ in range(n)]

    for length in range(2, n+1):
        for i in range(n-length + 1):
            j = i + length - 1
            dp[i][j] = int(1e9)

            for k in range(i, j):
                cost = dp[i][k] + dp[k+1][j] + (prefix[j+1] - prefix[i])
                dp[i][j] = min(dp[i][j], cost)
    
    print(dp[0][n-1])

    # dp = [[-1] * n for _ in range(n)]
    # res = recur(0, n-1)
    # print(res)