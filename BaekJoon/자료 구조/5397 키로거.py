import sys
input = sys.stdin.readline

T = int(input())
for _ in range(T):
    chars = input().rstrip()

    left, right = [], []
    for ch in chars:
        if ch == '-':
            if left:
                left.pop()
        elif ch == '<':
            if left:
                right.append(left.pop())
        elif ch == '>':
            if right:
                left.append(right.pop())
        else:
            left.append(ch)
    
    left.extend(reversed(right))
    print(''.join(left))
