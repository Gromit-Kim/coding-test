import sys
input = sys.stdin.readline
# sys.stdin.readline을 넣어도 시간 초과

def selection_sort(lst):
    length = len(lst)
    for i in range(length-1):
        min_idx = i
        for j in range(i+1, length):
            if lst[min_idx] > lst[j]:
                min_idx = j
        lst[i], lst[min_idx] = lst[min_idx], lst[i]
    return lst

n = int(input())
nums = []
for _ in range(n):
    nums.append(int(input()))

sorted_nums = selection_sort(nums)
for i in range(n):
    print(sorted_nums[i])