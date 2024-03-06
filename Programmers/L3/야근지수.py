def solution(n, works):
    while True:
        max_work = max(works)
        if max_work == 0 or n == 0:
            break
        works[works.index(max_work)] -= 1
        n -= 1
    return sum([work ** 2 for work in works])

print(solution(4, [4, 3, 3])) # 12