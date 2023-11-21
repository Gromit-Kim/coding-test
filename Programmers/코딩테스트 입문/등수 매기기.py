def get_avg(person_score):
    return sum(person_score) / 2

def solution(score):
    answer = []

    sorted_scores = score
    sorted_scores.sort(key = lambda x : get_avg(x), reverse = True)

    for s in score:
        for j, ss in enumerate(sorted_scores):
            if s == ss:
                answer.append(j + 1)
                break

    return answer