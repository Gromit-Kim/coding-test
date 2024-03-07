n = int(input())
stk = [] 
res = []
flag = True
cursor = 1
for _ in range(n):
    num = int(input())
    while cursor <= num:
        stk.append(cursor)
        res.append("+")
        cursor += 1
    if stk[-1] == num:
        stk.pop()
        res.append("-")
    else:
        flag = False
        break

if flag:
    for e in res:
        print(e)
else:
    print("NO")