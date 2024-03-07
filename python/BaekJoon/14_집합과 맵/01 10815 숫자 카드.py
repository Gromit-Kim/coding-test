n = int(input())
cards = list(map(int, input().split()))
m = int(input())
nums = list(map(int, input().split()))

dic = {card: 1 for card in cards}
for num in nums:
    if num in dic:
        print(1, end=' ')
    else:
        print(0, end=' ')
