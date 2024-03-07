steps = [ (2, 1), (2, -1), (-2, 1), (-2, -1), (1, 2), (1, -2),  (-1, 2), (-1, -2) ]

cur = input()
cur_row, cur_col = int(cur[0]), int(ord(cur[0])) - int(ord('a')) + 1

result = 0
for step in steps:
    next_row = cur_row + step[0]
    next_col = cur_col + step[1]
    if 1 <= next_row <= 8 and 1 <= next_col <= 8:
        result += 1
print(result)

