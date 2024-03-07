n, m, k = map(int,  input().split())
data = list(map(int, input().split()))
data.sort()
first, second = data[n-1], data[n-2]

# 가장 큰 수가 더해지는 횟수 계싼
count = int(m / (k+1)) * k
count += m % (k+1)

result = 0
result += (count) * first
result += (m-count) * second

print(result)