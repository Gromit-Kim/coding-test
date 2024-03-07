dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

def dfs(depth, n, visited, x, y):
    if depth == (n+1)**2 + 1:
        return
    visited[y][x] = depth
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if 0 <= nx < n and 0 <= ny < n:
            if not visited[ny][nx]:
                dfs(depth+1, n, visited, nx, ny)

def start(n):
    home = [[0]*(n) for _ in range(n)]
    dfs(1, n, home, 0, 0)
    for row in home:
        print(*row)

t = int(input())
for i in range(t):
    n = int(input())
    print(f'#{i+1}')
    start(n)