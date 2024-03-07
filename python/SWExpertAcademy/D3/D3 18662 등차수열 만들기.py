t = int(input())

for i in range(1, t + 1):
    a, b, c = map(int, input().split())
    
    middle = (a + c) / 2

    if b == middle:
        result = 0
    elif b > middle:
        result = b - middle
    else:
        result = middle - b
    
    print(f'#{i}', "{:.1f}".format(result))