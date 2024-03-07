N = int(input())
nums = list(map(int, input().split()))
M = int(input())
targets = list(map(int, input().split()))

dic = dict()
for num in nums:
    if num in dic:
        dic[num] += 1
    else:
        dic[num] = 1

ans = []
for target in targets:
    if target in dic:
        ans.append(dic[target])
    else:
        ans.append(0)

print(' '.join(map(str, ans)))