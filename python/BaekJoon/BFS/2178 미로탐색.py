from collections import deque

n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int, input())))


# 1 : 이동 가능 0 : 이동 불가능

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def bfs(graph, sx, sy):
    visited = [[False] * m for _ in range(n)]

    q = deque()
    q.append((sx, sy))
    visited[sx][sy] = True
    graph[sx][sy] = 1  # 시작 위치의 거리를 1로 설정

    while q:
        cur_x, cur_y = q.popleft()

        if cur_x == n - 1 and cur_y == m - 1:
            return graph[cur_x][cur_y]
        
        for i in range(4):
            nx, ny = cur_x + dx[i], cur_y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if graph[nx][ny] == 1 and not visited[nx][ny]:
                q.append((nx, ny))
                visited[nx][ny] = True
                graph[nx][ny] = graph[cur_x][cur_y] + 1
    return -1

print(bfs(graph, 0, 0))