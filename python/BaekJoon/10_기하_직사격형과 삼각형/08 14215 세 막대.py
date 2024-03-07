distances = list(map(int, input().split()))
distances.sort()

if distances[2] < distances[0] + distances[1]:
    print(sum(distances))
else:
    distances[2] = distances[0] + distances[1] - 1
    print(sum(distances))
