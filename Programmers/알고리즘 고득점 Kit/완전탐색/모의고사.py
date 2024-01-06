def solution(answers):
    one = [1, 2 ,3, 4, 5]
    two = [2, 1, 2, 3, 2, 4, 2, 5]
    three = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    cnts = [0, 0, 0]
    for i, v in enumerate(answers):
        if v == one[i % len(one)]:
            cnts[0] += 1
        if v == two[i % len(two)]:
            cnts[1] += 1
        if v == three[i % len(three)]:
            cnts[2] += 1
    
    res = []
    max_cnt = max(cnts)
    for i, cnt in enumerate(cnts):
        if cnt == max_cnt:
            res.append(i+1)
    res.sort()
    return res

print(solution([1,2,3,4,5]))
print(solution([1,3,2,4,2]))