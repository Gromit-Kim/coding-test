import sys
input = sys.stdin.readline

a, b, c = map(int, input().split())
car_count_by_time = dict()
for _ in range(3):
    start, end = map(int, input().split())
    for i in range(start, end):
        if i in car_count_by_time:
            car_count_by_time[i] += 1
        else:
            car_count_by_time[i] = 1

ans = 0
for val in car_count_by_time.values():
    if val == 1:
        ans += a
    elif val == 2:
        ans += b * 2
    elif val == 3:
        ans += c * 3

print(ans)