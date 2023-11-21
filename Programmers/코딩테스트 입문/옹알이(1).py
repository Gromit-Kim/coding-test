def solution(babbling):
    answer = 0
    can_speak = ("aya", "ye", "woo", "ma")

    for bab in babbling:
        for word in can_speak:
            bab = bab.replace(word, "x"*len(word))
        if bab == "x"*len(bab):
            answer += 1

    return answer