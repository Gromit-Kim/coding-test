def isOdd(num):
    if num % 2 != 0:
        return True
    return False

t = int(input())
for i in range(t):
    numbers = list(map(int, input().split()))
    total = 0
    for num in numbers:
        if isOdd(num):
            total += num
    print("#{:.0f}".format(i+1), total)

