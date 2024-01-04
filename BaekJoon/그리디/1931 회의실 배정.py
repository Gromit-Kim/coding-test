import sys
input = sys.stdin.readline

N = int(input())
meetings = []
for _ in range(N):
    start, end = map(int, input().split())
    meetings.append((start, end))

meetings.sort(key = lambda x: (x[1], x[0]))

time = 0
cnt = 0
for start, end in meetings:
    if time <= start:
        time = end
        cnt += 1

print(cnt)