# 사탕 색이 다른 인접한 두 칸
# 두 칸을 골라서 서로 교환

N = int(input())
board = [list(input()) for _ in range(N)]
ans = 1

def search():
    global ans
    for i in range(N): # row
        cnt = 1
        for j in range(1, N):
            if board[i][j] == board[i][j-1]:
                cnt += 1
                ans = max(ans, cnt)
            else:
                cnt = 1
    
    for i in range(N): # col
        cnt = 1
        for j in range(1, N):
            if board[j][i] == board[j-1][i]:
                cnt += 1
                ans = max(ans, cnt)
            else:
                cnt = 1

#  main
for i in range(N):
    for j in range(N):

        if j + 1 < N:
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j]
            search()
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j] # 복구
        
        if i + 1 < N:
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j]
            search()
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j]

print(ans)


    
