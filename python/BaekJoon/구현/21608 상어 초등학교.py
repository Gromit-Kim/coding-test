import sys
input = sys.stdin.readline

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
def likes_empty_cnt(y, x, board, likes, n):
    like_cnt = 0
    empty_cnt = 0
    for i in range(4):
        ny, nx = y + dy[i], x + dx[i]
        if ny < 0 or ny >= n or nx < 0 or nx >= n:
            continue
        if board[ny][nx] in likes:
            like_cnt += 1
        if board[ny][nx] == 0:
            empty_cnt += 1
    return like_cnt, empty_cnt


def find_seat(board, likes, n):
    seats = [] # (y, x, 좋아하는 학생 수, 비어있는 칸 수)
    for i in range(n):
        for j in range(n):
            if board[i][j] != 0:
                continue
            like_cnt, empty_cnt = likes_empty_cnt(i, j, board, likes, n)
            seats.append((i, j, like_cnt, empty_cnt))
    seats.sort(key=lambda x: (-x[2], -x[3], x[0], x[1]))
    return seats[0][0], seats[0][1]

N = int(input())
board = [[0] * N for _ in range(N)]
students = [[] for _ in range(N*N+1)]
for _ in range(N*N):
    info = list(map(int, input().split()))
    student = info[0]
    likes = info[1:]
    students[student].append(likes)
    y, x = find_seat(board, likes, N)
    board[y][x] = student

ans = 0
for i in range(N):
    for j in range(N):
        like_cnt, _ = likes_empty_cnt(i, j, board, students[board[i][j]][0], N)
        if like_cnt == 1:
            ans += 1
        elif like_cnt == 2:
            ans += 10
        elif like_cnt == 3:
            ans += 100
        elif like_cnt == 4:
            ans += 1000
        else:
            ans += 0
print(ans)

    

