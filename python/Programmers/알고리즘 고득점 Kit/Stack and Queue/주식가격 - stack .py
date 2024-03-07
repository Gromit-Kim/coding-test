def solution(prices):
    n = len(prices)
    answer = [0] * n
    stk = []
    for i in range(n):
        while stk and prices[stk[-1]] > prices[i]:
            past = stk.pop()
            answer[past] = i - past
        stk.append(i)
    for i in stk:
        answer[i] = n - i - 1
    return answer

print(solution([1,2,3,2,3]))