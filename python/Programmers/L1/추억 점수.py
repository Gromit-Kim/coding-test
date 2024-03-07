def solution(name, yearning, photo):
    answer = []
    dic = {}
    for i in range(len(name)):
        dic[name[i]] = yearning[i]
    
    for ph in photo:
        total = 0
        for i in range(len(ph)):
            if ph[i] in dic:
                total += dic[ph[i]]
        answer.append(total)

    return answer