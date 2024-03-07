import heapq
import sys
input = sys.stdin.readline
# sys.stdin.readline을 쓰지 않으면 시간초과가 난다.

n = int(input())
nums = []
for _ in range(n):
    # 최소 힙 -> pop 하면 자동으로 오름차순 정렬됨
    heapq.heappush(nums, int(input()))

for _ in range(n):
    tmp = heapq.heappop(nums)
    print(tmp)