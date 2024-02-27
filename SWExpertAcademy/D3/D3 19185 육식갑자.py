def get_name(y, s, t, n, m):
    s_i = y % n - 1
    t_i = y % m - 1
    return s[s_i] + t[t_i]

tc = int(input())
for i in range(1, tc+1):
    n, m = map(int, input().split())
    s = input().split()
    t = input().split()

    q = int(input())
    res = []
    for _ in range(q):
        y = int(input()) # 이름을 알고 싶은 년도
        res.append(get_name(y, s, t, n, m))
    print(f'#{i} {" ".join(res)}')