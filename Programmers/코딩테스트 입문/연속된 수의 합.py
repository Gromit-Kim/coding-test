def solution(num, total):
    answer = []

    start_num = (total - ((num-2)*(num-1)//2))//num

    for i in range(start_num, start_num+num):
        answer.append(i)



    return answer