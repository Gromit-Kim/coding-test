def gcd(a, b):
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

def lcm(a, b):
    return a * b / gcd(a, b)


t = int(input())
for _ in range(t):
    a, b = map(int, input().split())
    print(int(lcm(a, b)))
