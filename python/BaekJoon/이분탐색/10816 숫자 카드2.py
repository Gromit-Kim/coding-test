from bisect import bisect_left, bisect_right

N = int(input())
nums = list(map(int, input().split()))
M = int(input())
targets = list(map(int, input().split()))

nums.sort()
ans = []
for target in targets:
    right = bisect_right(nums, target)
    left = bisect_left(nums, target)
    ans.append(right - left)

print(' '.join(map(str, ans)))