n = int(input())
origin = list(map(int, input().split()))

set_origin = sorted(set(origin))
dic = {set_origin[i]: i for i in range(len(set_origin))}

for num in origin:
    print(dic[num], end=' ')
