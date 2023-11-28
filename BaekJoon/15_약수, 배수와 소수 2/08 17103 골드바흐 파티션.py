import sys
input = sys.stdin.readline

def get_prime_list(n):
    prime = [True for _ in range(n + 1)]
    prime[0], prime[1] = False, False  # 0과 1은 소수가 아님

    for p in range(2, int(n ** 0.5) + 1):
        if prime[p]:
            j = 2
            while p * j <= n:
                prime[p*j] = False
                j += 1
    return prime
    
t = int(input())
nums = [int(input()) for _ in range(t)]
max_num = max(nums)
primes = get_prime_list(max_num)

for num in nums:
    res = 0
    for i in range(2, num//2+1):
        if primes[i] and primes[num-i]:
            res += 1
    print(res)