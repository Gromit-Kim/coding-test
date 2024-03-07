from itertools import combinations

def solution(clothes):
    dic = dict()
    for _, category in clothes:
        dic[category] = dic.get(category, 0) + 1 
    
    answer = 1
    for key in dic:
        answer *= (dic[key] + 1) # +1 for the case where no clothes are worn
    return answer - 1 # remove the case where no clothes are worn