import sys
sys.setrecursionlimit(int(1e9))

def recur(idx, score, cnt):
    if idx > n:
        return -int(1e9)
    if idx == n:
        return score
    
    one_step, two_step = 0, 0
    if cnt < 2:
        one_step = recur(idx+1, score + steps[idx], cnt+1)
    else:
        one_step = -int(1e9)

    two_step = recur(idx+2, score + steps[idx], 1)
    return max(one_step, two_step)


n = int(input())
steps = []
for _ in range(n):
    step = int(input())
    steps.append(step)

print(recur(0,0,0))

    