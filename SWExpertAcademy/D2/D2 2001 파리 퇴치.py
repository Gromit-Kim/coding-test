t = int(input())
for i in range(1, t+1):
    n, m = map(int, input().split())
    
    board = []
    for _ in range(n):
        board.append(list(map(int, input().split())))
    
    result = 0
    for x in range(n-m+1):
        for y in range(n-m+1):
            current_sum = 0
            for row in range(m):
                for col in range(m):
                    current_sum += board[x+row][y+col]
            result = max(result, current_sum)
    
    print(f"#{i} {result}")
