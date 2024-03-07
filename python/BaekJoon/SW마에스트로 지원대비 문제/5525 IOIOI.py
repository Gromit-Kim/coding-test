def getPn(n): # n = 1 : IOI, n = 2 : IOIOI, n = 3 : IOIOIOI
    res = "IOI"
    for i in range(n - 1):
        res += "OI"
    return res

n = int(input()) # 1
m = int(input()) # 13
s = input() # OOIOIOIOIIOII # 10까지 가야해!
pn = getPn(n) # IOI

cnt = 0
for i in range(m - len(pn) + 1): # 13 - 3 + 1 = 11 
    if s[i:i + len(pn)] == pn:
        cnt += 1
print(cnt)