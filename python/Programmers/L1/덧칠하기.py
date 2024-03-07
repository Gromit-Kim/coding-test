def solution(n, m, section):
    if m == 1:
        return len(section)
    
    cnt = 0
    while section:
        start = section[0]
        limit = start + m - 1

        cnt += 1
        section = [x for x in section if x > limit]

    return cnt