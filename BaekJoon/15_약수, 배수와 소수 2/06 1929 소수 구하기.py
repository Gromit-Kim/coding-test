def sieve_of_eratosthenes(start, end):
    prime = [True for _ in range(end + 1)]
    p = 2

    while (p * p <= end):
        # p가 소수인 경우 p의 배수들을 소수에서 제외
        if prime[p]:
            for i in range(p*p, n+1, p):
                prime[i] = False
        p += 1

    results = []
    for p in range(max(2, start),n+1):
        if prime[p]:
            results.append(p)

    return results


m, n = map(int, input().split())
primes = sieve_of_eratosthenes(m, n)
for prime in primes:
    print(prime)