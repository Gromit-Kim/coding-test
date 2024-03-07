import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):
    stack = []
    is_balanced = True

    s = input().rstrip()
    for ch in s:
        if ch == '(':
            stack.append(ch)
        elif ch == ')':
            if not stack or stack.pop() != '(':
                is_balanced = False
                break
    
    if is_balanced and not stack:
        print('YES')
    else:
        print('NO')