prices = list(map(int, input().split()))

pay = 0
for price in prices:
    start, end = map(int, input().split())
    pay += price * (end - start)

print(pay)