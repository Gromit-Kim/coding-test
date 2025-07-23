
n, x = map(int, input().split())
arr = sorted(list(map(int, input().split())))

answer = 0
left, r = 0, n-1
remain = 0
while(left <= r):
    if arr[r] == x:
        answer += 1
        r -= 1
        continue
    
    if left == r:
        remain += 1
    
    target = x / 2
    res = arr[left] + arr[r]
    if res >= target:
        answer += 1
        r -= 1
        left += 1
    elif res < target:
        r += 1
        remain += 1


print(answer + remain // 3)
