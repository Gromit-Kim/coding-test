import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def find_max_score(i, steps, dp):
    if i <= 0:
        return 0
    if dp[i] != -1:
        return dp[i]
    dp[i] = max(find_max_score(i-2, steps, dp) + steps[i], 
                find_max_score(i-3, steps, dp) + steps[i-1] + steps[i])
    return dp[i]
    
t = int(input())
steps = [0] + [int(input()) for _ in range(t)]
dp = [-1] * (t+1)
find_max_score(t, steps, dp)
print(dp[t])