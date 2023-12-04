import sys
input = sys.stdin.readline

n = int(input())
stack = []
for _ in range(n):
    cmd = list(map(int, input().split()))

    btn = cmd[0]
    if btn == 1:
        stack.append(cmd[1])
    elif btn == 2:
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif btn == 3:
        print(len(stack))
    elif btn == 4:
        if stack:
            print(0)
        else:
            print(1)
    elif btn == 5:
        if stack:
            print(stack[-1])
        else:
            print(-1)