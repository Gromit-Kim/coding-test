from collections import deque

n, m = map(int, input().split())
graph = [list(input().split()) for _ in range(n)]

maxi = 0
for sy in range(n):
    for sx in range(m):
        if graph[sy][sx] != 'W':
            break

        visited = [[False for _ in range(m)] for _ in range(n)]
        cnt = 0
        
        q = deque([sy, sx])
        visited[sy][sx] = True

        while q:
            cur_y, cur_x = q.popleft()
            for dy, dx in [(1,0), (-1,0), (0,1), (0,-1)]:
                ny = cur_y + dy
                nx = cur_x + dx
                if not(0 <= nx < m and 0 <= ny < n):
                    break
                if not visited[ny][nx] and graph[ny][nx] == 'L':
                    visited[ny][nx] = True
                    cnt += 1
                    q.append([ny, nx])
        maxi = max(cnt, maxi)

print(maxi)




