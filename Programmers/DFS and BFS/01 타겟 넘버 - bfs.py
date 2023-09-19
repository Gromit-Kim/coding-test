from collections import deque


def bfs(numbers, target):
    cnt = 0
    q = deque([(numbers[0], 1), (-1 * numbers[0], 1)])  # 현재 숫자, 현재index?
    while q:
        total, next_num_idx = q.popleft()
        if next_num_idx == len(numbers):
            if total == target:
                cnt += 1
        else:
            q.append((total + numbers[next_num_idx], next_num_idx + 1))
            q.append((total - numbers[next_num_idx], next_num_idx + 1))

    return cnt


def solution(numbers, target):
    return bfs(numbers, target)
