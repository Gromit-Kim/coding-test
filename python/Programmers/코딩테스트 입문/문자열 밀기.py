def push_one_str(str):
    length = len(str)
    return str[-1] + str[0:length-1]

def solution(A, B):
    if len(A) != len(B):
        return -1
    
    for i in range(len(A)):
        if A == B:
            return i
        A = push_one_str(A)
    return -1