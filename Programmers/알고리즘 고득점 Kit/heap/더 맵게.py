import heapq

check = lambda scoville, K : all(s >= K for s in scoville)

def solution(scoville, K):
    heapq.heapify(scoville)
    
    cnt = 0
    while True:
        if check(scoville, K):
            break
        if not check(scoville, K) and len(scoville) == 1:
            cnt = -1
            break
        s1 = heapq.heappop(scoville)
        s2 = heapq.heappop(scoville)
        score = s1 + (s2 * 2)
        heapq.heappush(scoville, score)
        cnt += 1

    return cnt