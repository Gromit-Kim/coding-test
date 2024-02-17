n = int(input())
s = input()

total = 0
for i, ch in enumerate(s):
    a = ord(ch) - ord('a') + 1
    total += a * (31 ** i)
print(total % 1234567891)