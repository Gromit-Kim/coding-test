import heapq
def solution(jobs):
    jobs.sort()
    hq = []
    now, i, answer = 0, 0, 0
    n = len(jobs)

    while i < n:
        while jobs and jobs[0][0] <= now:
            start, work = jobs.pop(0)
            heapq.heappush(hq, (work, start))
        if hq:
            work, start = heapq.heappop(hq)
            now += work
            answer += now - start
            i += 1
        else:
            now = jobs[0][0]
    
    return answer // n

print(solution([[0, 3], [1, 9], [2, 6]])) # 9