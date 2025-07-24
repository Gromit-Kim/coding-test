n = int(input())
budgets = list(map(int, input().split()))
m = int(input()) # 총예산

answer = 0

s, e = 0, max(budgets)
while(s <= e):
    mid = (s + e) // 2

    total = 0
    for budget in budgets:
        if budget <= mid:
            total += budget
        else:
            total += mid
    
    if total <= m:
        s = mid + 1
        answer = mid
    elif total > m:
        e = mid - 1

print(answer)