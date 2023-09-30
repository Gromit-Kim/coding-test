n = int(input()) # 기록된 출입 기록 수
s = set()
for _ in range(n):
    name, log = input().split()
    if name not in s:
        s.add(name)
    else:
        s.discard(name)
res = sorted(s, reverse=True)
for name in res:
    print(name)