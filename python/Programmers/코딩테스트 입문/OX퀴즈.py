def solution(quiz):
    answer = []

    for q in quiz:
        sen, ans = q.split(' = ')
        sen = sen.split(' ')
        a, op, b = sen[0], sen[1], sen[2]
        if(op == '+'):
            if(int(a) + int(b) == int(ans)):
                answer.append('O')
            else:
                answer.append('X')
        elif(op == '-'):
            if(int(a) - int(b) == int(ans)):
                answer.append('O')
            else:
                answer.append('X')
        elif(op == '*'):
            if(int(a) * int(b) == int(ans)):
                answer.append('O')
            else:
                answer.append('X')
        elif(op == '/'):
            if(int(a) // int(b) == int(ans)):
                answer.append('O')
            else:
                answer.append('X')

    return answer