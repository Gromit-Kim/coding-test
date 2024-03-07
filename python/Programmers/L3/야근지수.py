def solution_time_over(n, works):
    while True:
        max_work = max(works)
        if max_work == 0 or n == 0:
            break
        works[works.index(max_work)] -= 1
        n -= 1
    return sum([work ** 2 for work in works])

import heapq
def solution(n, works):
    if sum(works) <= n:
        return 0
    works = [(-1)*work for work in works] # 최대힙을 구현하기 위해 음수로 변환
    heapq.heapify(works)
    while n:
        work = heapq.heappop(works) + 1
        heapq.heappush(works, work)
        n -= 1
    return sum([work ** 2 for work in works])

print(solution(4, [4, 3, 3])) # 12