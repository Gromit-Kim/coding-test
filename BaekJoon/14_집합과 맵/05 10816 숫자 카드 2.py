n = int(input())
cards = list(map(int, input().split()))
m = int(input())
nums = list(map(int, input().split()))

dic = {}
for card in cards:
    if card in dic:
        dic[card] += 1
    else:
        dic[card] = 1
for num in nums:
    # print(dic.get(num, 0), end=' ') # key가 없으면 기본값으로 0을 리턴함
    if num in dic:
        print(dic[num], end=' ')
    else:
        print(0, end=' ')
