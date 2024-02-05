def get_idx(word):
    if word in ["R", "T"]:
        return 1
    if word in ["C", "F"]:
        return 2
    if word in ["J", "M"]:
        return 3
    if word in ["A", "N"]:
        return 4

def solution(survey, choices):
    dic = {
        1 : {"R": 0, "T": 0},
        2 : {"C": 0, "F": 0},
        3 : {"J": 0, "M": 0},
        4 : {"A": 0, "N": 0}
    }
    
    n = len(survey)
    for i in range(n):
        k = get_idx(survey[i][0])
        score = abs(4 - choices[i])
        if choices[i] > 4:
            dic[k][survey[i][1]] += score
        if choices[i] < 4:
            dic[k][survey[i][0]] += score    
    
    answer = ''
    for d in dic:
        answer += max(dic[d], key = dic[d].get)
    return answer

print(solution(["AN", "CF", "MJ", "RT", "NA"], 	[5, 3, 2, 7, 5]))