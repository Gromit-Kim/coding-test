def gcd(a, b):# 31 75
    while b: # 75 -> 13
        if a > b: # 31, 13 /
            a, b = b, a # 31, 13
        b %= a # 0
    return a

def gcd_recursion(a, b):
    if b % a == 0:
        return a
    else:
        return gcd_recursion(b % a, a)


a1, b1 = map(int, input().split())
a2, b2 = map(int, input().split())

son = a1 * b2 + a2 * b1
mom = b1 * b2

g_res = gcd_recursion(son, mom)
res_son = son // g_res
res_mom = mom // g_res

print(res_son, res_mom)
