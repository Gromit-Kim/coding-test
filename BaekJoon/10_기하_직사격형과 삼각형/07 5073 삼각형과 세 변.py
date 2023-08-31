while True:
    lst = list(map(int, input().split()))
    if lst.count(0) == 3:
        break

    lst.sort()
    if lst[-1] >= lst[0] + lst[1]:
        print("Invalid")
    else:
        s = set(lst)
        if len(s) == 1:
            print("Equilateral")
        elif len(s) == 2:
            print("Isosceles")
        else:
            print("Scalene")