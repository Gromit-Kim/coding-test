import heapq
def solution(operations):
    answer = []
    hq = []
    for op in operations:
        cmd, n = op.split()
        n = int(n)
        if cmd == 'I':
            heapq.heappush(hq, n)
        else:
            if n == 1 and hq:
                max_val = max(hq)
                hq.remove(max_val)
            else:
                if hq:
                    heapq.heappop(hq)
    answer = [max(hq), heapq.heappop(hq)] if hq else [0, 0]
    return answer