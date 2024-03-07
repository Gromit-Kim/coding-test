def solution(s):
    stk = []
    for ch in s:
        if ch == '(':
            stk.append(ch)
        elif ch == ')':
            if stk: # try - except로 처리하면 더 빠르다.
                stk.pop()
            else:
                return False
    return len(stk) == 0