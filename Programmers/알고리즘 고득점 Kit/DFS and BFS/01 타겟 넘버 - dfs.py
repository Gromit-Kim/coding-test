def dfs(prev, num_idx, numbers, target):
    if num_idx == len(numbers):
        if prev == target:
            return 1
        else:
            return 0

    # 기본 로직
    cnt = 0
    cnt += dfs(prev+numbers[num_idx], num_idx+1, numbers, target)
    cnt += dfs(prev-numbers[num_idx], num_idx+1, numbers, target)

    return cnt

def solution(numbers, target):
    return dfs(0, 0, numbers, target)

target = 3
numbers = [1, 1, 1, 1, 1]
solution(numbers, target)