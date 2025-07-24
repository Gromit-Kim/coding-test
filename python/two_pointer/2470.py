n = int(input())
arr = sorted(list(map(int, input().split())))

diff = int(1e9)
result = []

left, right = 0, n-1
while(left < right):
    total = arr[left] + arr[right]

    if abs(total) < diff:
        diff = abs(total)
        result = [arr[left], arr[right]]
    
    if total < 0:
        left += 1
    elif total > 0:
        right -= 1
    else:
        break

print(*sorted(result))

