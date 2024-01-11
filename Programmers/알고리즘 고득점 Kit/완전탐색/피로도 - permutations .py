from itertools import permutations
def solution(k, dungeons):
    answer = -1
    for per in permutations(dungeons):
        init_k = k
        cnt = 0
        for required, cost in per:
            if init_k >= required:
                init_k -= cost
                cnt += 1
        answer = max(answer, cnt)
    return answer