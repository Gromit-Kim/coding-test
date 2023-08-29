n = int(input())

x_lst, y_lst = [], []
for _ in range(n):
    x, y = map(int, input().split())
    x_lst.append(x)
    y_lst.append(y)

x_lst.sort()
y_lst.sort()
print((x_lst[-1] - x_lst[0]) * (y_lst[-1] - y_lst[0]))
