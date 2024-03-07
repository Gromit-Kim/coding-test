k = int(input())
d, cnt = 1, 0
while d < k: # 초콜릿 크기 찾기
    d *= 2
if d == k:
    print(d, cnt)
else:
    init_d = d
    while k: # k : 먹어야할 초콜릿 수
        if k >= d: #  먹어야할 초콜릿 수 >= 초콜릿 크기
            k -= d # 먹을만큼 먹어
        else:
            d //= 2
            cnt += 1
    print(init_d, cnt)