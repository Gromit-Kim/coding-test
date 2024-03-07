def solution(score):
    answer = []

    avg_scores = []
    for s in score:
        avg_scores.append(sum(s)/2)
    
    sorted_scores = sorted(avg_scores, reverse=True)

    for avg_score in avg_scores:
        answer.append(sorted_scores.index(avg_score)+1)

    return answer