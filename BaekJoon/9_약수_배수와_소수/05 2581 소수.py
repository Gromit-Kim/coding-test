m = int(input())
n = int(input())

def isPrime(num):
    if num == 1:
        return False
    for i in range(2, num):
        if num % i == 0:
            return False
    return True

prime_lst = []
for num in range(m, n + 1):
    if isPrime(num):
        prime_lst.append(num)

if len(prime_lst) != 0:
    print(sum(prime_lst))
    print(min(prime_lst))
else:
    print("-1")
