def validateMonth(month):
    if month < 1 or month > 12:
        return False
    return True

def validateDay(month, day):
    if month in [1,3,5,7,8,10,12]:
        if day < 1 or day > 31:
            return False
    elif month in [4,6,9,11]:
        if day < 1 or day > 30:
            return False
    elif month == 2:
        if day < 1 or day > 28:
            return False
    return True

t = int(input())

for i in range(1, t+1):
    date = input()

    year = date[0:4]
    month = date[4:6]
    day = date[6:8]

    if validateMonth(int(month)) and validateDay(int(month), int(day)):
        print(f"#{i}", f'{year}/{month}/{day}')
    else:
        print(f"#{i}",-1)
