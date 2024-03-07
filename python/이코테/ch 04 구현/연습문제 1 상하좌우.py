dic = {'U' : 0, 'D': 1, 'L' : 4, 'R' : 3}
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

n = int(input())
plans = input().split()

x, y = 1, 1 #  현재
for plan in plans:
    i = dic[plan]
    nx, ny = x + dx[i] , y+ dy[i]
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
    x, y = nx, ny
print(y, x)
