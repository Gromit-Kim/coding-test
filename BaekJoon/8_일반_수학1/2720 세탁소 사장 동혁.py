t = int(input())

coins = (25, 10, 5, 1)  # quater, dime, nickel, penny
for _ in range(t):
    input_money = int(input())
    res = []
    for i in range(4):
        cnt = input_money // coins[i]
        input_money = input_money % coins[i]
        res.append(int(cnt))

    print(" ".join(str(item) for item in res))
