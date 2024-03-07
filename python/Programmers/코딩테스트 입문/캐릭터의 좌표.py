dic = {"up" : (0,1), "down" : (0,-1), "left" : (-1,0), "right" : (1,0)}

def solution(keyinput, board):
    board_x, board_y = (board[0]-1)//2, (board[1]-1)//2
    cur_x, cur_y = 0, 0

    for key in keyinput:
        cur_x += dic[key][0]
        cur_y += dic[key][1]

        if cur_x < -1*board_x:
            cur_x = -1*board_x
        elif cur_x > board_x:
            cur_x = board_x
        
        if cur_y < -1*board_y:
            cur_y = -1*board_y
        elif cur_y > board_y:
            cur_y = board_y

    return [cur_x, cur_y]