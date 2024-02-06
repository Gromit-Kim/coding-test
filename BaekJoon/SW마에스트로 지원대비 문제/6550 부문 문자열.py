from collections import deque
while True:
    try:
        s, t = input().split()
        q = deque(list(s))
        for cur in t:
            if q and cur == q[0]:
                q.popleft()
        print("Yes" if not q else "No")
    except Exception as e:
        break
