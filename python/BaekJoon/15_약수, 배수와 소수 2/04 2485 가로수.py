# https://www.acmicpc.net/problem/2485

# 모든 가로수가 같은 간격이 되도록 새로 심어야 하는 가로수의 최소수
# 추가되는 나무는 기존 나무들 사이에만 심을 수 있음
import sys
input = sys.stdin.readline
from math import gcd
# def gcd(n1, n2):
#     while n2:
#         if n1 > n2:
#             n1, n2 = n2, n1
#         n1 %= n2
#     return n1

n = int(input())  # 이미 심어진 가로수의 수
prev = int(input())
intervals = []
for i in range(n-1):
    cur = int(input())
    tmp = cur - prev
    intervals.append(tmp)
    prev = cur

g = intervals[0]
for i in range(1, len(intervals)):
    g = gcd(g, intervals[i])

cnt = 0
for interval in intervals:
    cnt += (interval // g - 1)

print(cnt)
