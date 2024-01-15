def check(mid, times):
    cnt = 0
    for time in times:
        cnt += mid // time 
    return cnt

def solution(n, times):
    times.sort()
    start = times[0]
    end = times[-1] * n
    while start <= end:
        mid = (start + end) // 2
        c = check(mid, times)
        if c >= n:
            end = mid -1
        else:
            start = mid + 1
    return start
