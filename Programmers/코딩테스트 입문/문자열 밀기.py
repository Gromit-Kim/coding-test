def push_one_str(str):
    length = len(str)
    return str[-1] + str[0:length-1]

def solution(A, B):
    if len(A) != len(B):
        return -1
    
    for i in range(len(A)):
        print(A)
        if A == B:
            return i
        A = push_one_str(A)
    return -1

print(solution("hello", "ohell"))  # 출력: 1