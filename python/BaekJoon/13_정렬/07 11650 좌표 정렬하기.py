n = int(input())
point_lst = []
for _ in range(n):
    point = list(map(int, input().split()))
    point_lst.append(point)

point_lst.sort()
for i in range(n):
    x, y = point_lst[i][0], point_lst[i][1]
    print(x, y)
