def get_slice_length(foods, mid):
    total = 0
    for food in foods:
        if food > mid:
            total += food - mid
    return total

def bi_search(start, end, target):
    while start <= end:
        mid = (start + end) // 2 # mid : 절단기가 자르는 높이
        slice_length = get_slice_length(foods, mid)
        if  slice_length == target:
            return mid
        elif slice_length > target:
            start = mid + 1
        else:
            end = mid - 1

n, m = map(int, input().split())
foods = list(map(int, input().split()))
foods.sort()
print(bi_search(0, foods[-1], m))

