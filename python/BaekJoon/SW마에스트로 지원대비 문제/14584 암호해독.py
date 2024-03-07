import sys
input = sys.stdin.readline

def decode(cipher, key):
    decoded = ''
    for c in cipher:
        decoded += chr((ord(c) - ord('a') - key) % 26 + ord('a'))
    return decoded

cipher = input().rstrip()
n = int(input())
words = [input().rstrip() for _ in range(n)]
for i in range(26):
    decoded = decode(cipher, i)
    if any(word in decoded for word in words):
        print(decoded)
        break