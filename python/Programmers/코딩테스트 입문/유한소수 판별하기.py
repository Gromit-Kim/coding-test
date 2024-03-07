def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def hasOnlyTwoOrFive(n):
    for factor in [2, 5]:
        while n % factor == 0:
            n //= factor
    return n == 1 

def solution(a, b):
    g = gcd(a, b)
    down = b // g

    if hasOnlyTwoOrFive(down):
        return 1 
    return 2
