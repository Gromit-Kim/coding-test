import sys
sys.setrecursionlimit(int(1e9))

def recur(y, x):
    if dp[y][x] != -1:
        return dp[y][x]
    
    if y == n-1 and x == m -1:
        return 1
    
    route = 0
    for dy, dx in [(1,0), (-1, 0), (0, 1), (0, -1)]:
        nx = x + dx
        ny = y + dy
        if 0<= nx < m and 0 <= ny < n:
            if graph[y][x] > graph[ny][nx]:
                route += recur(ny, nx)
    dp[y][x] = route
    return dp[y][x]


n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]

dp = [[-1 for _ in range(m)] for _ in range(n)] # dp[i][j] : i,j 에 도달하는 방법의 수
answer = recur(0, 0)
print(answer)