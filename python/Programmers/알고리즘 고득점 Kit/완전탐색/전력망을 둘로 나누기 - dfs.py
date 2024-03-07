def dfs(v, board, visited):
    visited[v] = True
    cnt = 1
    for n in board[v]:
        if not visited[n]:
            cnt += dfs(n, board, visited)
    return cnt

def start(n, wires):
    linked_board = [[] for _ in range(n+1)]
    visited = [False] * (n+1)
    for top1, top2 in wires:
        linked_board[top1].append(top2)
        linked_board[top2].append(top1)
    cnt1 = dfs(1, linked_board, visited)
    cnt2 = sum(not v for v in visited) - 1
    return abs(cnt1-cnt2)
    
def solution(n, wires):
    answer = 1000
    for i in range(len(wires)):
        tmp_wire = wires.pop(i)
        answer = min(answer, start(n, wires))     
        wires.insert(i, tmp_wire)
    return answer