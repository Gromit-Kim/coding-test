n = int(input())
graph = []
start_point = []
for i in range(n):
    graph.append(list(map(int, input())))
    for j in range(n):
        if graph[i][j] == 1:
            start_point.append((i, j))

visited = [[False] * n for _ in range(n)]

# 단지수(나눠진 그래프 수), 단지 내의 수
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(sx, sy, graph, visited):
    visited[sx][sy] = True
    home_cnt = 1
    for i in range(4):
        nx, ny = sx + dx[i], sy + dy[i]
        if nx < 0 or nx >= n or ny < 0 or ny >= n:
            continue
        if graph[nx][ny] == 1 and not visited[nx][ny]:
            home_cnt += dfs(nx, ny, graph, visited)
    return home_cnt

danji_cnt = 0
res = []
for sx, sy in start_point:
    if not visited[sx][sy]:
        danji_cnt += 1
        res.append(dfs(sx, sy, graph, visited))
print(danji_cnt)
res.sort()
print(*res, sep='\n')