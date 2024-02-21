stk = []
def dfs(stk, n, m):
    if len(stk) == m:
        print(' '.join(map(str, stk)))
        return
    for i in range(n):
        stk.append(i+1)
        dfs(stk, n, m)
        stk.pop()
n, m = map(int, input().split())
dfs(stk, n, m)