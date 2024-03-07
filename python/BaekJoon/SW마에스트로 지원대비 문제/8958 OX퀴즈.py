import sys
input = sys.stdin.readline

def getScore(problems):
    total = 0
    for i, p in enumerate(problems):
        if p == 'O':
            score = 0
            for j in range(i, -1, -1):
                if problems[j] == 'X':
                    break
                score += 1
            total += score
    return total

t = int(input())
for _ in range(t):
    problems = input().rstrip()
    print(getScore(problems))