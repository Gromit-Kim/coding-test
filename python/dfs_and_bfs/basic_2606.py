from collections import deque

n = int(input())
m = int(input())

linked = [[] for _ in range(n+1)]
for _ in range(m):
    a, b = map(int, input().split())
    linked[a].append(b)
    linked[b].append(a)

visited = [False] * (n+1)

q = deque([1])
visited[1] = True
answer = 0

while q:
    cur = q.popleft()
    for nxt in linked[cur]:
        if not visited[nxt]:
            q.append(nxt)
            visited[nxt] = True
            answer +=1

print(answer)
