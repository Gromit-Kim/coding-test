h, w, n, m = map(int, input().split())
x, y = 1, 1
cnt_x, cnt_y = 1, 1
while True:
    x += m + 1
    if x > w:
        break
    cnt_x += 1
while True:
    y += n + 1
    if y > h:
        break
    cnt_y += 1
print(cnt_x * cnt_y)