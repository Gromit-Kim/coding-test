from collections import deque
def isPossible(cur, word):
    cnt = 0
    for i in range(len(cur)):
        if cur[i] != word[i]:
            cnt += 1
    return cnt == 1

def solution(begin, target, words):
    n = len(words)
    visited = [False] * n
    q = deque([(begin, 0)])
    while q:
        cur, t = q.popleft()
        if cur == target:
            return t
        for i in range(n):
            if visited[i] or not isPossible(cur, words[i]):
                continue
            q.append((words[i], t+1))
            visited[i] = True
    return 0