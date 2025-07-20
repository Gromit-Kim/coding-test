def recur(idx, time, price):
    global answer
    if idx >= n:
        return
    if idx == n-1:
        answer = max(answer, price)
        return
    
    recur(idx+time, consults[idx][0], price + consults[idx][1])
    recur(idx+1, 0, price)

n = int(input())
consults = list(map(int, input().split()) for _ in range(n))
answer = 0
recur(0, 0, 0)
print(answer)