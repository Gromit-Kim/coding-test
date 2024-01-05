import sys
sys.setrecursionlimit(10**6)

n = int(input())
dp = [-1] * (n + 1)

def f(n):
    if dp[n] != -1:
        return dp[n]
    dp[n] = n if n <= 2 else (f(n-1) + f(n-2))
    return dp[n]

print(dp[n] % 10007)