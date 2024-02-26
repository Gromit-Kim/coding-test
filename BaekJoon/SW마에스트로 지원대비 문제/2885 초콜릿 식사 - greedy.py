k = int(input())
D, size = 0, 0
while D < k: # 초콜릿 크기 찾기
    D = 2 ** size
    size += 1

split_cnt = 0
flag = False
new_D = D
for i in range(1, new_D): # i : 초콜릿의 개수 (D조각 * i 개)
    for j in range(1, i+1): # j : i개의 D 조각 중 j만큼을 사용한다
        if new_D * j == k:
            flag = True
            break
    if flag:
        break
    split_cnt += 1 # 1번 더 쪼갠다.
    new_D = new_D // 2

print(D, split_cnt)