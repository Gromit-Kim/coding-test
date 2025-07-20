
def recur(idx, a, b, c, d, e):
    global answer
    global used
    global answer_used

    if idx >= n:
        if a >= needs[0] and b >= needs[1] and c >= needs[2] and d >= needs[3]:
            answer = min(answer, e)
            answer_used = []
            for i in used:
                answer_used.append(i)
        return
    
    used.append(idx+1)
    recur(idx+1, a + nuts[idx][0], b + nuts[idx][1], c + nuts[idx][2], d + nuts[idx][3], e + nuts[idx][4])
    used.pop()

    recur(idx+1, a, b, c, d, e)


n = int(input())
needs = list(map(int, input().split()))
nuts = [list(map(int, input().split())) for _ in range(n)]

answer = int(1e9)

used = []
answer_used = []

recur(0, 0, 0, 0, 0, 0)
if answer_used:
    print(answer)
    print(*answer_used)
else:
    print(-1)