t = int(input())

for i in range(1, t+1):
    numbers = list(map(int, input().split()))
    numbers.sort()
    print(f"#{i} {numbers[-1]}")