n = int(input())
people = []
for _ in range(n):
    person = tuple(input().split())
    people.append(person)

people.sort(key=lambda x: int(x[0]))
for i in range(n):
    age, name = people[i]
    print(age, name)
