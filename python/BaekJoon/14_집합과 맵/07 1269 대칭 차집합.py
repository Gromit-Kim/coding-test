n1, n2 = map(int, input().split())
a = set(map(int, input().split()))
b = set(map(int, input().split()))

res = a ^ b
print(len(res))
