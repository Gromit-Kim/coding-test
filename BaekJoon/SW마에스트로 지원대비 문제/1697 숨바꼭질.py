from collections import deque
n, k = map(int, input().split())
t = k - n # 목표지점까지의 거리
visited = [0] * (100000)
if t <= 0:
    print(-t)
else:
    q = deque([n])
    while q:
        x = q.popleft()
        if x == k:
            print(visited[x])
            break
        for nx in [x-1, x+1, 2*x]:
            if 0 <= nx <= 100000 and not visited[nx]:
                visited[nx] = visited[x] + 1
                q.append(nx)