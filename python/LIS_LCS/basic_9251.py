# 가장 긴, 두 수열에 공통적으로 포함되는 경우를 찾아라.
# A  C  A  Y  K  P
# C  A  P  C  A  K

# 1. 완전탐색적으로 풀어보자.
# 
# 1) 첫 번째 수열에서 만들 수 있는 모든 부분 수열을 꺼낸다.
# [A]
# [A, C]
# [A, A]
# [A, Y]
# [A, P], ...
# 
# 2) 2를 1)에서 구한 것으로 비교한다.

# Well-knonw 문제이지롱
# M = SALTYA
# N = SALEA
# LCS(M, N)은 SALA가 가장 길다.
# 
# SALTY       A
# SALE        A
# 
# LCS(M, N) = LCS(M[:-1], N[:-1]) + 1
# 
# if 끝의 문자가 같다면
#    하나씩 때서 없애주고 + 1을 해준다.
# else:
#    정답에 영향을 주지 않는 것을 없앤다.

m = list(str(input()))
n = list(str(input()))

dp = [[0] for _ in range(len(n)+1) for _ in range(len(m) + 1)]

for i in range(1, len(m) + 1): # 문자를 하나 결정
    for j in range(1, len(n) + 1): # 문자를 결정
        if m[i-1] == n[j-1]:
            dp[i][j] = dp[i-1][j-1] + 1
        else:
            dp[i][j] = max(dp[i-1][j], dp[i][j-1])

print(dp[len(m)][len(n)])
