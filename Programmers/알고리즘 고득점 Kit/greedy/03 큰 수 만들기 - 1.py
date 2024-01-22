def solution(number, k):
    answer = ''
    n = len(number) # 이중 k 개를 지운다.
    start = 0
    for i in range(n-k, 0, -1):
        end = n - i
        max_n = '0'
        for j in range(start, end+1):
            if max_n < number[j]:
                max_n = number[j]
                start = j + 1
            if max_n == '9':
                break
        answer += max_n
    return answer