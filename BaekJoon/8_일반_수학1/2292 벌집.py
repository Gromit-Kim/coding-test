n = int(input())  # 1에서 n 번 방까지

# 벌집이 1(1), 6 (2 to 7), 12(8to 19), 18(20to37),
# 몇 번 껍질에 속하는 지 알고 + ?? 개

# if n is 58, 58 // 6 = 9, 58 % 6 // 4
shell = 1
cnt = 1
while n > shell:
    shell = shell + cnt * 6
    cnt += 1
print(cnt)

