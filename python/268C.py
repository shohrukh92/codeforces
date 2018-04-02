# http://codeforces.com/contest/268/problem/C

n, m = map(int, input().split())
d = min(n, m)
print(d + 1)
for i in range(d + 1): print("{} {}".format(d-i, i))