from collections import deque

def bfs(v, board, visited, n):
    q = deque([v])
    visited[v] = True
    cnt = 1
    while q:
        c = q.popleft()
        for i in range(1, n+1):
            if i == c:
                continue
            n = i
            if not visited[n] and n in board[c]:
                q.append(n)
                visited[n] = True
                cnt += 1
    return cnt

def start(n, wires):
    linked_board = [[] for _ in range(n+1)]
    visited = [False] * (n+1)
    for top1, top2 in wires:
        linked_board[top1].append(top2)
        linked_board[top2].append(top1)
    cnt1, cnt2 = 0, 0
    for i in range(1, n+1):
        if not visited[i]:
            if cnt1 == 0: # def bfs(v, board, visited, n):
                cnt1 = bfs(i, linked_board, visited, n)
            else:
                cnt2 = bfs(i, linked_board, visited, n)
    return abs(cnt1-cnt2)
    
def solution(n, wires):
    answer = 1000
    for i in range(len(wires)):
        tmp_wire = wires.pop(i)
        answer = min(answer, start(n, wires))     
        wires.insert(i, tmp_wire)
    return answer