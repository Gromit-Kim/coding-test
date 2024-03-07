def solution(arr):
    answer = []
    for e in arr:
        if not answer:
            answer.append(e)
        else:
            if answer[-1] != e:
                answer.append(e)
    return answer