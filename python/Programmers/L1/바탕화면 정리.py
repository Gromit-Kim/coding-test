def solution(wallpaper):
    row = len(wallpaper)
    col = len(wallpaper[0])

    min_x, min_y, max_x, max_y = row, col, 0, 0
    for i in range(row):
        for j in range(col):
            if wallpaper[i][j] == "#":
                min_x = min(min_x, i)
                min_y = min(min_y, j)
                max_x = max(max_x, i+1)
                max_y = max(max_y, j+1)

    return [min_x, min_y, max_x, max_y]