def check(mid, rocks, distance):
    last_pos, remove_cnt = 0, 0
    for rock in rocks:
        if rock - last_pos <  mid:
            remove_cnt +=1
        else:
            last_pos = rock
    if distance - last_pos < mid:
        remove_cnt += 1
    return remove_cnt # 제거할 수 있는 바위의 수를 가져온다.

def solution(distance, rocks, n): 
    answer = 0 # 
    rocks.sort()
    left, right = 0, distance
    while left <= right:
        mid = (left + right) // 2
        cnt = check(mid, rocks, distance) # cnt는 제거할 바위의 수
        if cnt <= n: # 제거할 바위의 수가 n보다 작거나 같으면 (n은 제거하고자하는 바위의 수)
            left = mid + 1 # 범위를 큰쪽으로 탐색한다.
            answer = max(answer, mid)
        else:
            right = mid - 1
    return answer