s = input()

sub_s = set()
for i in range(len(s)):
    for j in range(i, len(s)):
        sub_s.add(s[i:j+1])

print(len(sub_s))
