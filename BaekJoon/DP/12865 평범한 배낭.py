import sys
input = sys.stdin.readline

n, k = map(int,input().split())
dp = [0] * (k+1)
for _ in range(n):
    w, v = map(int,input().split())
    for i in range(k, w-1, -1): # 나보다 무거운 친구들을 나를 통해서 계산한다
        # 그들이 가진 무게 vs 나의 무게와 나의 무게만큼 뺀 무게
        dp[i] = max(dp[i], dp[i-w] + v)
print(max(dp))