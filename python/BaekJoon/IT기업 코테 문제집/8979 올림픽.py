n, k = map(int, input().split()) # n : 국가의 수 / k : 등수를 알고 싶은 국가
scores = [0] * (n+1)
for _ in range(n):
    nation, gold, silver, dong = map(int, input().split())
    scores[nation] = gold * 3 + silver * 2 + dong

k_score = scores[k]
scores.sort(reverse=True)
cnt = 1
for s in scores:
    if s > k_score:
        cnt += 1
print(cnt)