def move_count(ch):
    if ch == 'M':
        return 13
    elif ch < 'M':
        return ord(ch) - ord('A')
    else:
        return ord('Z') - ord(ch) + 1

def solution(name):
    answer = 0
    n = len(name)
    min_move = n - 1
    for i in range(n):
        answer += move_count(name[i])
        
        nc = i + 1
        while nc < n and name[nc] == 'A':
            nc += 1
        min_move = min(min_move, i*2 + n - nc)
        
    answer += min_move
    return answer