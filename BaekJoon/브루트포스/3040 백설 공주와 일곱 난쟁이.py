# 재귀함수를 이용한 풀이
# 9개의 숫자 중 7개를 뽑는 경우의 수를 모두 구한 후 합이 100인 경우를 출력
# 9개의 숫자 중 7개를 뽑는 경우의 수를 구하는 방법은 9개의 숫자 중 2개를 뽑는 경우의 수를 구하는 방법과 동일
import sys
input = sys.stdin.readline

dwarf = [int(input()) for _ in range(9)]
tot = sum(dwarf)

for i in range(8):
    for j in range(i+1, 9):
        if tot - dwarf[i] - dwarf[j] == 100:
            for k in dwarf:
                if k != dwarf[i] and k != dwarf[j]:
                    print(k)

    