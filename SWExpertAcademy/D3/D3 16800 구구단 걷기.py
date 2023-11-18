t = int(input())
for i in range(1,t+1):
    n = int(input())
    min_distance = n - 1
    for j in range(2,int(n**0.5)+1):
        if n % j == 0:
            x = j
            y = n // j
            distance = x - 1 + y - 1
            min_distance = min(min_distance, distance)
    
    print(f"#{i} {min_distance}")