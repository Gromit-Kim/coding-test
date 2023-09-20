# heapq : 최소 힙으로 구성
# heapq.heappush(), heapq.heappop()

import heapq

n = int(input())
h = []
for _ in range(n):
    tmp = int(input())
    heapq.heappush(h,tmp)

while h:
    print(heapq.heappop(h))
