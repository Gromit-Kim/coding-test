def solution(n, lost, reserve):
    s1 = set(lost)
    s2 = set(reserve)
    intersec = list(s1 & s2)
    for inter in intersec:
        lost.remove(inter)
        reserve.remove(inter)
    lost.sort()
    reserve.sort()
    
    for r in reserve:
        if (r-1) in lost:
            lost.remove(r-1)
        elif(r+1) in lost:
            lost.remove(r+1)
    return n - len(lost)