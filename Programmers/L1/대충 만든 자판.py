def get_min_count(keymap, target):
    min_count = 0
    for i in range(len(target)):
        cnt_per_key = []
        for key in keymap:
            if target[i] in key:
                cnt_per_key.append(key.index(target[i])+1)

        if len(cnt_per_key) == 0:
            return -1
        min_count += min(cnt_per_key)
            
    return min_count

def solution(keymap, targets):
    answer = []
    for target in targets:
        answer.append(get_min_count(keymap, target))
    return answer