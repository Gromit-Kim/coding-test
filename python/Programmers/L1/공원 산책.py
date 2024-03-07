def solution(park, routes):
    answer = []

    move = {'E': [1,0], 'W': [-1,0], 'S': [0,1], 'N': [0,-1]}

    park_row = len(park)
    park_col = len(park[0])

    start_x, start_y = 0, 0
    for i in range(park_row):
        for j in range(park_col):
            if park[i][j] == "S":
                start_x, start_y = j, i
                break

    cur_x, cur_y = start_x, start_y
    for route in routes:
        direction, distance = route.split()
        distance = int(distance)

        dx, dy = move[direction]

        valid_move = True
        for step in range(1, distance+1):
            next_x = cur_x + dx * step
            next_y = cur_y + dy * step

            if next_x < 0 or next_x >= park_col or next_y < 0 or next_y >= park_row or park[next_y][next_x] == "X":
                valid_move = False
                break
        
        if valid_move:
            cur_x += dx * distance
            cur_y += dy * distance

    answer.append(cur_y)
    answer.append(cur_x)

    return answer

print(solution(	["OSO", "OOO", "OXO", "OOO"], ["E 2", "S 3", "W 1"]))