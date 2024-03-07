def gcd_range(start, end):
    return start if start == end else 1


t = int(input())
for i in range(1, t+1):
    n1, n2 = map(int, input().split())
    result = gcd_range(n1, n2)
    print("#{} {}".format(i, result))