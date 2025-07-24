n, m = map(int, input().split())
trees = list(map(int, input().split()))

s, e = 0, max(trees)
while(s <= e):
    mid = (s + e) // 2
    
    wood = 0
    for tree in trees:
        if tree >= mid:
            wood += tree - mid
    
    if wood >= m:
        s = mid + 1
    else:
        end = mid - 1

print(e)
