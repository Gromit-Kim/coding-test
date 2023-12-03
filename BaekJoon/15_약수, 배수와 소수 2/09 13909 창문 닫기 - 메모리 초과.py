n = int(input())

windows = [True] * (n + 1)
windows[0] = False
for i in range(2, n + 1):
    person = i
    while person <= n:
        windows[person] = not windows[person]
        person += i

print(windows.count(True))