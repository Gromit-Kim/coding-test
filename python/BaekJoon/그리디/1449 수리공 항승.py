import sys
input = sys.stdin.readline

N, L = map(int, input().split())
holes = list(map(int, input().split()))
holes.sort()

cnt = 0
end = 0
for hole in holes:
    if hole > end:
        cnt += 1
        end = hole + L - 1

print(cnt)