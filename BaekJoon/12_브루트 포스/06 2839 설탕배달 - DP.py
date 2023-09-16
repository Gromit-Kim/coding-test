# dp[i] : i라는 숫자를 만들기 위해 필요한 3or 5의 최소 개수
n = int(input())
dp = [0] * max(6, n+1)

dp[3], dp[5] = 1, 1 # 3과 5는 이미 하나로 만들 수 있음
for n in range(6, n+1):
    if dp[n-3]: # 만약 n-3을 만들 수 있으면
        dp[n] = dp[n-3] + 1 # n도 3을 더해서 만들 수 있으므로

    if dp[n-5]: # n-5를 만들 수 있다면
        if dp[n-3]: # 동시에 n-3을 이용해서도 만들 수 있다면
            dp[n] = min(dp[n], dp[n-5]+1) # 둘 중 더 적은 것을 사용한다.
        else: # 5를 더 해 만들 수도 있다.
            dp[n] = dp[n-5] + 1

print(dp[n]) if dp[n] else print(-1)
