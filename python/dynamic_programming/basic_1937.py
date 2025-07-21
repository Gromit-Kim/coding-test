def recur(y, x):
    point = 0
    for dx, dy in [(1,0), (-1,0), (0,1), (0,-1)]:
        nx = x + dx
        ny = y + dy
        if 0 <= nx < n and 0 <= ny < n:
            if graph[x][y] < graph[nx][ny]:
                point = max(point, recur(nx, ny) + 1)
    return point

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]
answer = 0
for sy in range(n):
    for sx in range(n):
        cnt = recur(sx, sy)
        answer = max(answer, cnt)
print(answer)
