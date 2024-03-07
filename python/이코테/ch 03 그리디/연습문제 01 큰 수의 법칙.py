# 주어진 수들을 M 번 더하여 가장 큰 수를 만든다.
# 단 배열의 특정 인덱스(번호)에 해당하는 수가 연속해서 K번을 초과할 수 없다.
n, m, k = map(int, input().split())
data = list(map(int, input().split()))
data.sort()
first, second = data[n-1], data[n-2]

result = 0
while m > 0:
    for i in range(k):
        if m == 0:
            break
        result += first
        m -= 1
    if m == 0:
        break
    result += second
    m -= 1

print(result)