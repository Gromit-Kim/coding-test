# https://www.acmicpc.net/problem/13241

def gcd(n1, n2):
    while n2:
        if n1 > n2:
            n1, n2 = n2, n1
        n2 %= n1
    return n1
def lms(n1, n2):
    return n1*n2//gcd(n1, n2)

a, b = map(int, input().split())
print(lms(a, b))
