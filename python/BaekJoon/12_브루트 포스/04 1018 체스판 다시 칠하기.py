# M N 보드
# 8*8 크기의 체스판으로 자른 후,
# 몇 개의 정사각형을 다시 칠해
# 다시 칠해야하는 정사각형의 최 소 개수
n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(input().strip('\n')))

bw = [['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'],
      ['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'],
      ['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'],
      ['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'],
      ['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'],
      ['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'],
      ['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'],
      ['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B']]
wb = [['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'],
      ['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'],
      ['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'],
      ['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'],
      ['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'],
      ['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'],
      ['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'],
      ['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W']]


def wb_check(x, y):
    cnt = 0
    for i in range(8):
        for j in range(8):
            if graph[x + i][y + j] != wb[i][j]:
                cnt += 1
    return cnt


def bw_check(x, y):
    cnt = 0
    for i in range(8):
        for j in range(8):
            if graph[x + i][y + j] != bw[i][j]:
                cnt += 1
    return cnt


cnt = 0
min_val = 100000
for sx in range(n - 7):
    for sy in range(m - 7):
        res = min(wb_check(sx, sy), bw_check(sx, sy))
        if min_val > res:
            min_val = res

print(min_val)
