n_chars = input()
nums = []
for n_char in n_chars:
    nums.append(int(n_char))
nums.sort(reverse=True)
print(''.join(str(num) for num in nums))