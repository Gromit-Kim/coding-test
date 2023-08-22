n = int(input())
cut = 1
start_row = False
while True:
    if ((cut - 1) * cut) / 2 < n <= (cut * (cut + 1)) / 2:
        break
    cut += 1
    start_row = not start_row

# print(cut, start_row)

if start_row:
    x, y = 0, cut + 1
else:
    x, y = cut + 1, 0

cnt = int(n - (((cut - 1) * cut) / 2))  # // 이 아니라 /을 한 순간 float가 됨.5
for i in range(cnt):
    if start_row:  # row부터 시작되면
        x += 1
        y -= 1
    else:
        y += 1
        x -= 1
print("{}/{}".format(x, y))
