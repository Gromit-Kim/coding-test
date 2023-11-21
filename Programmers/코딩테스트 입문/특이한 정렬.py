def solution(numlist, n):
    return numlist.sort(key=lambda x : (abs(x-n), -x))