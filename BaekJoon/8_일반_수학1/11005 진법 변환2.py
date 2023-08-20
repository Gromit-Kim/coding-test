# 10진법의 수 N을 B 진법으로 출력하기
n, b = map(int, input().split())

dic = {10: 'A', 11: 'B', 12: 'C', 13: 'D', 14: 'E', 15: 'F', 16: 'G', 17: 'H', 18: 'I', 19: 'J', 20: 'K',
       21: 'L', 22: 'M', 23: 'N', 24: 'O', 25: 'P', 26: 'Q', 27: 'R', 28: 'S', 29: 'T', 30: 'U',
       31: 'V', 32: 'W', 33: 'X', 34: 'Y', 35: 'Z'}

res = ''
while n != 0:
    remainder = n % b
    n = n // b
    if remainder >= 10:
        res = dic[remainder] + res
    else:
        res = str(remainder) + res

print(res)
