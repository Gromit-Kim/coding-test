t = int(input())

for i in range(t):
    a, b, c = map(int, input().split())
    middle = (a + c) / 2
    res = abs(middle - b)
    if res != 0:
        print("#{:.0f}".format(i+1), "{:.1f}".format(res))
    else:
        print("#{:.0f}".format(i+1), int(res))