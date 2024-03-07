# pocketmon name -> number / number -> name
import sys
def input():
    return sys.stdin.readline().rstrip()

n, m = map(int, input().split())  # n : 포켓몬 수, m : 문제의 수

name_to_num = {}
num_to_name = {}
for i in range(1, n + 1):
    name = input()
    num_to_name[i] = name
    name_to_num[name] = i

for _ in range(m):
    x = input()
    if x.isdigit():
        print(num_to_name[int(x)])
    else:
        print(name_to_num[x])
