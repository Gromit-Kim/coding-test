def solution(phone_book):
    s = set()
    for phone_num in phone_book:
        s.add(phone_num)
    
    for num in s:
        temp = ""
        for n in num:
            temp += n
            if temp in s and temp != num:
                return False
    return True