x_lst, y_lst = [], []
for _ in range(3):
    x, y = map(int, input().split())
    x_lst.append(x)
    y_lst.append(y)

res_x, res_y = -1, -1
for x_item in x_lst:
    item_cnt = x_lst.count(x_item)
    if item_cnt == 1:
        res_x = x_item
        break

for y_item in y_lst:
    item_cnt = y_lst.count(y_item)
    if item_cnt == 1:
        res_y = y_item
        break
print(res_x, res_y)
