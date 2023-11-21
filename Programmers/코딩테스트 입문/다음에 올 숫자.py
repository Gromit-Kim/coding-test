def solution(common):
    answer = 0

    is_dung_char = common[1] - common[0] == common[2] - common[1]

    if(is_dung_char):
        answer = common[-1] + (common[1] - common[0])
    else:
        answer = common[-1] * (common[1] // common[0])

    return answer