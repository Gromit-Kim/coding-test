def get_total_cut(trees, height):
    total = 0
    for tree in trees:
        if tree > height:
            total += tree - height
    return total

def bi_search(start, end, target): # start, end는 절단기 높이 범위. target은 필요한 나무 길이
    ans = 0
    while start <= end:
        mid = (start + end) // 2
        if get_total_cut(trees, mid) >= target:
            ans = mid
            start = mid + 1
        else:
            end = mid - 1
    return ans

def bi_search_recur(left, right, target):
    if left > right:
        return right
    mid = (left + right) // 2
    if get_total_cut(trees, mid) >= target:
        return bi_search_recur(mid + 1, right, target)
    else:
        return bi_search_recur(left, mid - 1, target)

N, M = map(int, input().split())
trees = list(map(int, input().split()))
print(bi_search(0,max(trees),M))