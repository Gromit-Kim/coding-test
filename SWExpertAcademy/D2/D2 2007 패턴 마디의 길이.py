t = int(input())
for i in range(1, t+1):
    result = 0
    chars = input()
    for j in range(1, 10):
        if chars[:j] == chars[j:j+j]:
            result = j
            break
    print(f"#{i} {result}")