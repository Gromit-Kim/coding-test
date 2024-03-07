dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int, input())))

def dfs(x, y):
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False
    if not graph[x][y]:
        graph[x][y] = 1 # 방문 처리
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            dfs(nx, ny)
        return True
    return False

res = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j):
            res += 1
print(res)