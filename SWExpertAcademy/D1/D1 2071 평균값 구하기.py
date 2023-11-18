t = int(input())

for i in range(1, t+1):
    numbers = list(map(int, input().split()))
    total = sum(numbers)
    average = total / len(numbers)
    print(f"#{i} {round(average)}")