import sys
import heapq
input = sys.stdin.readline

N = int(input())
hq = []
for _ in range(N):
    nums = list(map(int, input().split()))
    for num in nums:
        if len(hq) < N: # N개보다 작으면
            heapq.heappush(hq, num) # 그냥 넣는다. (heapq는 최소힙이므로)
        else:
            if hq[0] < num: # 현재 가장 작은값 보다 새로온 수가 크면
                heapq.heappop(hq) # 가장 작은 거 빼고
                heapq.heappush(hq, num) # 새로운 수(더 큰 수)를 넣는다.

print(hq[0]) # 가장 작은 수부터 가장 큰수 N개가 담겨있는 heapq상태