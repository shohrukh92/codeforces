# http://codeforces.com/problemset/problem/552/B

sn = input()
n_digits = len(sn)
n = int(sn)

result = 0
for i in range(1, n_digits):
    result += i * 9 * 10**(i-1)

counted = 10**(n_digits-1) - 1
result += n_digits * (n - counted)

print(result)