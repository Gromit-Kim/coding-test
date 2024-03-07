 # 6이 최소 3개 이상 연속으로 들어가는 수
 # N번째 영화 제목 -> N번째로 작은 종말의 수

n = int(input())

res = 0
while n != 0:
    res += 1
    tmp = res
    while tmp != 0:
        if tmp % 1000 == 666:
            n -= 1
            break
        else:
            tmp //= 10

print(res)