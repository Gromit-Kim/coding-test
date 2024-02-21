n = int(input())
tree = []
for _ in range(n):
    row = list(map(int, input().split()))
    tree.append(row)

for i in range(1, n): # i = 1
    for j in range(i+1): #  j is 0, 1 
        if j == 0:
            tree[i][0] += tree[i-1][0]
        elif j == i:
            tree[i][j] += tree[i-1][j-1]
        else:
            tree[i][j] += max(tree[i-1][j-1], tree[i-1][j])

print(max(tree[n-1]))