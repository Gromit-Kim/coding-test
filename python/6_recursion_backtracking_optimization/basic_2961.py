def recur(idx, dan, jan, use):
    global answer

    if idx >= n:
        if use == 0:  # 아무 재료도 사용하지 않은 경우.
            return
        diff = abs(dan - jan)
        answer = min(answer, diff)
        return
    
    recur(idx+1, dan + ingredents[idx][0], jan * ingredents[idx][1], use =1)
    recur(idx+1, dan, jan, use)


n = int(input())
ingredents = [list(map(int, input().split())) for _ in range(n)]

answer = int(1e9)
recur(0, 0, 1, 0)
print(answer)
