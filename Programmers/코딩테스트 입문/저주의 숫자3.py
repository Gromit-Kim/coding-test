def has_three(n):
    while n > 0:
        if n % 10 == 3:
            return True
        n //= 10
    return False

def solution(n):

    cur_num = 0
    for _ in range(n):
        cur_num += 1
        while True:
            if has_three(cur_num) or cur_num % 3 == 0:
                cur_num += 1
            else:
                break

    return cur_num

print(solution(15))