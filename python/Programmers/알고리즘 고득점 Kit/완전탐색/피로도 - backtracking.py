def dfs(cnt, n, visited, k, dungeons):
    max_cnt = cnt # 현 깊이에서 최대 방문 횟수
    for i , (required, cost) in enumerate(dungeons):
        if not visited[i] and k >= required:
            visited[i] = True
            max_cnt = max(max_cnt, dfs(cnt+1, n+1, visited, k-cost, dungeons))
            visited[i] = False
    return max_cnt

def solution(k, dungeons):
    n = len(dungeons)
    visited = [False] * n
    return dfs(0, n, visited, k, dungeons)
