while True:
    s = input()
    if s == '.':
        break

    stack = []
    is_balanced = True
    for ch in s:
        if ch == '(' or ch == '[':
            stack.append(ch)
        elif ch == ')':
            if stack and stack[-1] == '(':
                stack.pop()
            else:
                is_balanced = False
                break
        elif ch == ']':
            if stack and stack[-1] == '[':
                stack.pop()
            else:
                is_balanced = False
                break
    
    print("yes") if not stack and is_balanced else print("no")