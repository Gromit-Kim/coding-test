n = int(input())
for i in range(1, n+1):
    count = 0
    tmp = i
    while tmp > 0:
        if tmp % 10 == 3 or tmp % 10 == 6 or tmp % 10 == 9:
            count += 1
        tmp = tmp // 10
    if count > 0:
        print('-'*count, end=' ')
    else:
        print(i, end=' ')