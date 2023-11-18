chars = input().upper()
for char in chars:
    toNum = ord(char) - ord('A') + 1
    print(toNum, end=' ')