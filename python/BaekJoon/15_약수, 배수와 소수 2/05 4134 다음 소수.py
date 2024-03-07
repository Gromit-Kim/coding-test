from math import sqrt

def is_prime(number):
    if number <= 1:
        return False
    for i in range(2, int(sqrt(n)+1)):
        if n % i == 0:
            return False
    return True

t = int(input())
for _ in range(t):
    n = int(input())
    while True:
        if is_prime(n):
            print(n)
            break
        n += 1


