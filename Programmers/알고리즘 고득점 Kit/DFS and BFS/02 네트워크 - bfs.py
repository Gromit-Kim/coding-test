from collections import deque

def bfs(start, visited, computers, n):
    q = deque([start])
    visited[start] = True
    while q:
        vertex = q.popleft()
        for i in range(n):
            if computers[vertex][i] == 1 and not visited[i]:
                q.append(i)
                visited[i] = True
    return 1

def solution(n, computers):
    answer = 0
    visited = [False] * n
    for i in range(n):
        if not visited[i]:
            answer += bfs(i, visited, computers, n)
    return answer