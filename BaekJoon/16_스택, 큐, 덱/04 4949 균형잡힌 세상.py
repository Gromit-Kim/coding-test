while True:
    s = input()
    if s == '.':
        break

    stack = []
    for ch in s:
        if ch == '(' or ch == '[':
            stack.append(ch)
        elif ch == ')':
            if stack and stack[-1] == '(':
                stack.pop()
        elif ch == ']':
            if stack and stack[-1] == '[':
                stack.pop()
    
    print("yes") if not stack else print("no")