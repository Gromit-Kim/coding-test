n = int(input())
one_area = list(map(int, input().split()))

cur = 1 
two_area = []

flag = True
while True:
    if cur > n:
        break

    if one_area and cur == one_area[0]:
        one_area.pop(0)
        cur += 1
    elif two_area and cur == two_area[-1]:
        two_area.pop()
        cur += 1
    elif one_area and (not two_area or one_area[0] < two_area[-1]):
        two_area.append(one_area.pop(0))
    else:
        flag = False
        break

print('Nice') if flag else print('Sad')

# 첫 번째 에리아를 돌면서 현재 순서와 일치하면 가장 낮은 인덱스의 친구를 pop 키고, cur를 올려준다
# 일치하지 않으면 
#  two area의 가장 높은 인덱스를 가진 친구를 확인한다. cur와 같으면 그친 구를 pop 하고 cur를 올린다.
#  cur와 다르면 one_area의 가장 낮은 인덱스를 가진 친구를 two_area로 append 한다. 
#       이때, cur는 올리지 않는다. + one_area의 가장 낮은 인덱스를 가진 친구가 two_area에 가장 높은 인덱스를 가진 친구보다 작아야 한다.
