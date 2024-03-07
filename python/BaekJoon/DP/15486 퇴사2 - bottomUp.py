import sys
input = sys.stdin.readline

n = int(input())
dp = [0] * (n+1) # dp[i] = i일까지 얻은 최고 금액, 1부터 시작하므로 n+1
for day in range(n): # day = 0, 1, 2, ..., n-1
    t, p = map(int, input().split())
    remain = n - day
    if remain >= t: # 남은 날이 상담 기간 보다 긴 경우(상담을 할 수 있으면)
        # 상담을 안 한 경우(이미 그 날 짜의 것)vs 상담을 한 경우(오늘까지 얻은 최고 금액 + 오늘 일할 것)
        dp[day+t] = max(dp[day+t], dp[day]+p) 
    if day + 1 <= n:
        dp[day+1] = max(dp[day+1], dp[day])

print(dp[n])
