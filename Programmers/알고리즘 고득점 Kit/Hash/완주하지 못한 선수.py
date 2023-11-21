def solution(participant, completion):
    dic = {}
    sum_hash = 0

    for part in participant:
        dic[hash(part)] = part
        sum_hash += hash(part)
    
    for comp in completion:
        sum_hash -= hash(comp)

    return dic[sum_hash]

print(solution(["leo", "kiki", "eden"], ["eden", "kiki"]))