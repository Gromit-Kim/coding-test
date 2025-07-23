
n = int(input())
numbers = list(map(int, input().split()))
x = int(input())
numbers.sort()

left, right = 0, n-1
cnt = 0
while(left < right):
    res = numbers[left] + numbers[right]
    if res == x:
        cnt += 1
    
    if res >= x:
        right -=1
    elif res < x:
        left +=1

print(cnt)

# two pointer
# 가능성이 없는 것을 삭제하는 일
# sort를 수행해서 1 2 3 5 7 9 10 11 12
# left : 0, right : n-1
# left가 가리키는 것과 right가 가리키는 것을 합쳐서 target이 나오면 res + 1
# 큰 숫자가 나오면 right를 -1 (값이 작아짐)
# 작은 숫자가 나오면 left를 + 1 한다. (값이 커짐)