def recur(idx, weight, value):
    global answer

    if weight > b:
        return

    if idx > a:
        answer = min(answer, value)
        return
    
    recur(idx+1, weight + items[idx][0], value + items[idx][1])
    recur(idx+1, weight, value)


a, b= map(int, input().split()) 
items = list(map(int, input().split()) for _ in range(a))
answer = 0
recur(0, 0, 0)
print(answer)
