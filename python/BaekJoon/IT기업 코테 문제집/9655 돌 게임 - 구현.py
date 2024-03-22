n = int(input())
turn_sk = False 
while True:
    if n == 0:
        break
    if n >= 3:
        n -= 3
    else:
        n -= 1
    turn_sk = not turn_sk

if turn_sk:
    print("SK")
else:
    print("CY")
