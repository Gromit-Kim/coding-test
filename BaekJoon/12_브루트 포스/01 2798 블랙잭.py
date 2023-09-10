# 카드 합이 M을 넘지 않으면서 최대한 M과 가깝게
# N장 중 3장 고름
from itertools import combinations

n, m = map(int, input().split())
cards = list(map(int,input().split()))

res = 0
for combi in combinations(cards,3):
    s = sum(combi)
    if s <= m:
        res = max(res, s)

print(res)


