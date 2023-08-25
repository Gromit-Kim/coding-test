n, k = map(int, input().split())

res = 0
for i in range(1, n + 1):
    if n % i == 0:
        k -= 1
        if k == 0:
            res = i

print(res)
