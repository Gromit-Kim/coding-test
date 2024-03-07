n = int(input())
nums = set(input().split())
m = int(input())
search_nums = input().split()
for sn in search_nums:
    print(1) if sn in nums else print(0)