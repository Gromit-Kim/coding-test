def bi_search(start, end, target):
    while start <= end:
        mid = (start + end) // 2
        if have[mid] == target:
            return True
        elif have[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return False

n = int(input())
have = list(map(int, input().split()))
m = int(input())
need = list(map(int, input().split()))
have.sort()

for val in need:
    if bi_search(0, n-1, val):
        print("yes", end=" ")
    else:
        print("no", end=" ")
