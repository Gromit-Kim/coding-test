import sys
input = sys.stdin.readline

def merge(lst, low, mid, high):
    n1 = mid - low + 1
    n2 = high - mid

    left, right = [0] * n1, [0] * n2

    # copy data to tmp arrays
    for i in range(0, n1):
        left[i] = lst[low + i]
    for i in range(0, n2):
        right[i] = lst[mid + 1 + i]

    # i : left의 index, j : right의 idx, k : 합병된 arr의 idx
    i, j, k = 0, 0, low

    while i < n1 and j < n2:
        if left[i] <= right[j]:
            lst[k] = left[i]
            i += 1
        else:
            lst[k] = right[j]
            j += 1
        k += 1

    # 나머지 처리
    while i < n1:
        lst[k] = left[i]
        i += 1
        k += 1

    while j < n2:
        lst[k] = right[j]
        j += 1
        k += 1


def merge_sort(lst, low, high):
    if low < high:
        mid = (low + high) // 2

        merge_sort(lst, low, mid)
        merge_sort(lst, mid + 1, high)
        merge(lst, low, mid, high)

n = int(input())
nums = []
for _ in range(n):
    nums.append(int(input()))

merge_sort(nums, 0, n-1)
for i in range(n):
    print(nums[i])