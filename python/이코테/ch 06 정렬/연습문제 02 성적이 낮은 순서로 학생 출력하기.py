n = int(input())
students = []
for _ in range(n):
    name, score = input().split()
    students.append((name, score))
students.sort(key=lambda x: x[1])
for name, _ in students:
    print(name, end=" ")