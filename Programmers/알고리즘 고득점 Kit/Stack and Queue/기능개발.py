import math
def solution(progresses, speeds):
    answer = []

    try_cnt = [math.ceil((100 - p) / s) for p, s in zip(progresses, speeds)]
    while try_cnt:
        cnt = 0
        limit = try_cnt[0]
        while try_cnt and try_cnt[0] <= limit:
            cnt += 1
            try_cnt.pop(0)
        answer.append(cnt)

    return answer

print(solution([99, 96, 94], [1,3,4])) # [2,1]