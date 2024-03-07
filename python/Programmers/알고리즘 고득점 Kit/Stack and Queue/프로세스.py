from collections import deque
def solution(priorities, location):
    q = deque([(p, i) for i, p in enumerate(priorities)])
    cnt = 0
    while q:
        p, name = q.popleft()
        if any( p < other[0]for other in q):
            q.append((p, name))
        else:
            cnt += 1
            if name == location:
                return cnt