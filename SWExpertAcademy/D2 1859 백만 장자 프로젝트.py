def calculate_max_profit(prices):
    max_profit = 0
    max_price_so_far = 0

    for price in reversed(prices):
        if price > max_price_so_far:
            max_price_so_far = price
        else:
            max_profit += max_price_so_far - price
    
    return max_profit   

t = int(input())
for i in range(1, t+1):
    n = int(input())
    prices = list(map(int, input().split()))
    result = calculate_max_profit(prices)
    print(f'#{i} {result}')