def move_count(ch):
    return min(ord(ch) - ord('A'), ord('Z') - ord(ch) + 1)

def solution(name):
    answer = 0
    n = len(name)
    min_move = n - 1 # 한쪽으로 끝까지 이동하기 (최대 이동 횟수)
    for i in range(n):
        answer += move_count(name[i])

        next_ch = i + 1
        while next_ch < n and name[next_ch] == 'A':
            next_ch += 1 # A가 아닌 문자가 나올 때까지 이동
        min_move = min(min_move, i + i + n - next_ch) # i까지 이동 후, 왼쪽으로가서 next_ch까지 이동
        min_move = min(min_move, i + 2 *(n - next_ch)) # i까지 이동 후, 오른쪽으로 next_ch까지 이동
    return answer + min_move