def sieve_of_eratosthenes(start, end):

    prime = [True for _ in range(end+1)]
    prime[0] = prime[1] = False

    p = 2
    while (p * p <= end):
        if prime[p]:
            for i in range(p*2, end + 1, p):
                prime[i] = False
        p+=1
    
    return sum(prime[start:])


while True:
    n = int(input())
    if n == 0:
        break

    print(sieve_of_eratosthenes(n+1, 2*n))