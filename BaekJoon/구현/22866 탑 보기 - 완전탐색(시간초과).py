n = int(input())
buildings = list(map(int, input().split()))

for i, building in enumerate(buildings):
    result = []
    # 오른쪽으로 가기
    limit = building
    for j in range(i+1, n):
        if buildings[j] > limit:
            result.append(j+1)
            limit = buildings[j]

    # 왼쪽으로 가기
    limit = building
    for j in range(i-1, -1, -1):
        if buildings[j] > limit:
            result.append(j+1) 
            limit = buildings[j]
    if not result:
        print(0)
    else:
        result.sort(key=lambda x : (abs(x-i), x))
        print(len(result), result[0])