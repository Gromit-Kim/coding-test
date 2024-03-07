a, b, c, d, e, f = map(int, input().split())

def check(x, y):
    if a*x + b*y == c and d*x + e*y == f:
        return True
    return False

flag = False
for x in range(-999, 1000):
    if flag:
        break
    for y in range(-999, 1000):
        if check(x, y):
            print(x, y)
            flag = True
            break




