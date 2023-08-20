n = int(input())

# 전체 점의 수가 2**2, 3**2, 5**2, 9**2 방식으로 증가함
# 한 변에 있는 점의 수는 2, 3, 5, 9
# 한 변에 있는 점의 수의 증가 폭은 1, 2, 4, ..
point_in_line = 2
inc = 1
for i in range(n):
    point_in_line += inc # 9
    inc *= 2  # 4
print(pow(point_in_line, 2))
