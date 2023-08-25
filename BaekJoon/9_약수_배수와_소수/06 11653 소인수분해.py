n = int(input())

i = 2
while n != 1:  # 몫이 1이 아닌 경우
    for i in range(2, n + 1):
        if n % i == 0:
            print(i)
            n = n // i
            break
