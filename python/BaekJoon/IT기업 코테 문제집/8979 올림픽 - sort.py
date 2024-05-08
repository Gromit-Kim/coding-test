n, k = map(int, input().split()) # n : 국가의 수 / k : 등수를 알고 싶은 국가
medals = [list(map(int, input().split())) for _ in range(n)]
medals.sort(key=lambda x : (x[1], x[2], x[3]), reverse=True)

