import sys
input = sys.stdin.readline

n = int(input())
memoization = [0] * 10001

for _ in range(n):
    num = int(input())
    memoization[num] += 1

for i, memo in enumerate(memoization):
    if memo != 0:
        while memo != 0:
            print(i)
            memo -= 1
