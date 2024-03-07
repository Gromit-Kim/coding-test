n, m = map(int, input().split())
min_in_row = []
for _ in range(n):
    row = list(map(int, input().split()))
    min_in_row.append(min(row))
print(max(min_in_row))