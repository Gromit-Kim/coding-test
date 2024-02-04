def getExtIdx(ext):
    if ext == "code":
        return 0
    if ext == "date":
        return 1
    if ext == "maximum":
        return 2
    if ext == "remain":
        return 3

def solution(data, ext, val_ext, sort_by):
    answer = []
    standard = getExtIdx(ext)
    for d in data:
        if d[standard] < val_ext:
            answer.append(d)
    sort_std = getExtIdx(sort_by)
    answer.sort(key=lambda x : x[sort_std])

    return answer