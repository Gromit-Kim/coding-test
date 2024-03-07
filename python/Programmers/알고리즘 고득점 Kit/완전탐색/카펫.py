def solution(brown, yellow):
    answer = []
    area = brown + yellow
    
    possible = []
    for i in range(3, area // 2):
        if area % i == 0:
            possible.append([i, area // i])
    
    for p in possible:
        if (p[0] - 2) * 2 + p[1] * 2 == brown:
            answer = p
            break
    answer.sort(reverse = True)
    return answer

print(solution(10, 2))
print(solution(8, 1))
print(solution(24, 24))