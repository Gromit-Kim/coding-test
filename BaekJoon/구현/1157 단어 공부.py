# https://www.acmicpc.net/problem/1157

word = input().upper()
dic = dict()

for ch in word:
    if ch in dic:
        dic[ch] += 1
    else:
        dic[ch] = 1

max_val = max(dic.values())

ans = []
for key, val in dic.items():
    if val == max_val:
        ans.append(key)

print("?") if len(ans) > 1 else print(ans[0])