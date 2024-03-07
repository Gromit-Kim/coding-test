# n의 분해합 : n과 n을 이루는 각 자리 수의 합
# 자연수 M의 분해합이 N이면 M이 N의 생성자
# 245의 분해합은 245+2+4+5=256이고 245는 256의 생성자
# n의 가장 작은 생성자 구하기

def get_sep_sum(num):
    sum = num
    str_num = str(num)
    for s in str_num:
        sum += int(s)
    return sum

n = int(input())

flag = True
for i in range(n-1):
    if get_sep_sum(i) == n:
        flag = False
        print(i)
        break
if flag:
    print(0)
