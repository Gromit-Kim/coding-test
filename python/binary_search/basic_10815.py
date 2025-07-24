n = int(input())
numbers = list(map(int, input().split()))
numbers.sort()
m = int(input())
targets = list(map(int, input().split()))

result = []
for target in targets:
    s, e = 0, n-1
    find = False
    while (s < e):
        mid = (s + e) // 2
        if numbers[mid] == target:
            result.append(1)
            find = True
            break
        if numbers[mid] < target:
            s = mid + 1
        elif numbers[mid] > target:
            e = mid - 1
    if not find:
        result.append(0)

print(*result)