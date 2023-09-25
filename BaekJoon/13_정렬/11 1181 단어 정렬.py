n = int(input())
lst = []
for _ in range(n):
    input_str = input()
    if input_str not in lst:
        lst.append(input_str)

lst.sort(key=lambda x: (len(x), x))
for item in lst:
    print(item)
