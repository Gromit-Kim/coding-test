import sys
input = sys.stdin.readline
t = int(input())
steps = [0] * (t+1)
for i in range(1, t+1):
    steps[i] = int(input())

if t == 1:
    print(steps[1])
elif t == 2:
    print(steps[1] + steps[2])
else: 
    dp = [0] * (t+1)
    dp[1] = steps[1]
    dp[2] = steps[1] + steps[2]
    for i in range(3, t+1):
        dp[i] = max(steps[i] + steps[i-1] + dp[i-3], steps[i] + dp[i-2])

    print(dp[t])