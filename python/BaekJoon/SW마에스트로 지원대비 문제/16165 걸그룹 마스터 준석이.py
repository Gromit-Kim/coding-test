import sys
input = sys.stdin.readline

n, m = map(int, input().split())
dic = dict()
for i in range(n):
    g_name = input().rstrip()
    g_num = int(input().rstrip())
    dic[g_name] = []
    for _ in range(g_num):
        member = input().rstrip()
        dic[g_name].append(member)

for _ in range(m):
    name = input().rstrip()
    q = int(input().rstrip())
    if q: # 1
        for key in dic.keys():
            if name in dic[key]:
                print(key)
    else: # 0
        for mem in sorted(dic[name]):
            print(mem)