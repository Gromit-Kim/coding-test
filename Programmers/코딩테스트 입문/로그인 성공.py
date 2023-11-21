def solution(id_pw, db):

    input_id = id_pw[0]
    input_pw = id_pw[1]

    for data in db:
        db_id = data[0]
        db_pw = data[1]
        if input_id == db_id:
            if input_pw == db_pw:
                answer = "login"
                break
            else:
                answer = "wrong pw"
                break
        else:
            answer = "fail"
            continue

    return answer