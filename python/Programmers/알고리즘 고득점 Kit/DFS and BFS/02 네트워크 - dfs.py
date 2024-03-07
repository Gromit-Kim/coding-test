import sys
sys.setrecursionlimit(10**6)

def dfs(start, visited, computers, n):
    visited[start] = True
    for i in range(n):
        if computers[start][i] == 1 and not visited[i]:
            dfs(i, visited, computers, n)
    return 1

def solution(n, computers):
    answer = 0
    visited = [False] * n
    for i in range(n):
        if not visited[i]:
            answer += dfs(i, visited, computers, n)
    return answer