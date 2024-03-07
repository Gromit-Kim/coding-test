def solution(nums):
    answer = 0
    how_many = len(nums) // 2
    set_nums = set(nums)
    if len(set_nums) >= how_many:
        answer = how_many
    else:
        answer = len(set_nums)
    return answer