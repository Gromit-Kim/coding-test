import sys
input = sys.stdin.readline

s = set()
m = int(input())
for _ in range(m):
    users_input = list(input().split())
    cmd = users_input[0]

    if cmd == "add":
        s.add(int(users_input[1]))
    elif cmd == "remove":
        try:
            s.remove(int(users_input[1]))
        except:
            pass
    elif cmd == "check":
        print(1) if int(users_input[1]) in s else print(0)
    elif cmd == "toggle":
        if int(users_input[1]) in s:
            s.remove(int(users_input[1]))
        else:
            s.add(int(users_input[1]))
    elif cmd == "all":
        s = set([i for i in range(1, 21)])
    else:
        s = set()
    