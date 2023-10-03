n, m = map(int,input().split()) # 듣도 못한 사람 수, 보도 못한 사람수

no_listen = set()
for _ in range(n):
    no_listen.add(input())

no_see = set()
for _ in range(m):
    no_see.add(input())

no_listen_and_see = no_listen & no_see
res = sorted(no_listen_and_see)
print(len(res))
for item in res:
    print(item)