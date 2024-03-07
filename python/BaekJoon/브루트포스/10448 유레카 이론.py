T = [n * (n+1) // 2 for n in range(46)]

def is_possible(num):
    for i in range(1, 46):
        for j in range(1, 46):
            for k in range(1, 46):
                if T[i] + T[j] + T[k] == num:
                    return 1
    return 0

# == main == 
t = int(input())
for _ in range(t):
    num = int(input())
    print(is_possible(num))