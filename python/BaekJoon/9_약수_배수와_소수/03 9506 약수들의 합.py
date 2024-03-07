def getCommonDivider(num):
    common_divider = []
    for i in range(1, n):  # n을 n이 아닌 약수들의 합으로 나타냄
        if num % i == 0:  # 약수이면
            common_divider.append(i)
    return common_divider


def isPerfectNum(num, common_divider):
    if len(common_divider) != 0:
        return True if sum(common_divider) == num else False
    return False


while True:
    n = int(input())
    if n == -1:
        break

    common_divider = getCommonDivider(n)
    if isPerfectNum(n, common_divider):
        print(n, "=", ' + '.join(str(item) for item in common_divider))
    else:
        print(n, "is NOT perfect.")
