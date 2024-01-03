N = int(input())
expr = input()

nums = []
dic = dict()
for i in range(N):
    dic[chr(ord('A') + i)] = int(input())

for e in expr:
    if e.isalpha():
        nums.append(dic[e])
    else:
        b = nums.pop()
        a = nums.pop()
        if e == '+':
            nums.append(a+b)
        elif e == '-':
            nums.append(a-b)
        elif e == '*':
            nums.append(a*b)
        elif e == '/':
            nums.append(a/b)

print(f'{nums[0]:.2f}')