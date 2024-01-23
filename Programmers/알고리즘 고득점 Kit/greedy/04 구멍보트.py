from collections import deque
def solution(people, limit):
    answer = 0
    q = deque(sorted(people))
    while q:
        total = q.pop()
        if q and total + q[0] <= limit:
            q.popleft()
        answer += 1    
    return answer