n = int(input())

def isPrime(number):
    if number == 1:
        return False

    for i in range(2, number):
        if number % i == 0:
            return False
    return True

cnt = 0
numbers = list(map(int, input().split()))
for i in range(n):
    if isPrime(numbers[i]):
        cnt += 1
print(cnt)
