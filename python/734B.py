# http://codeforces.com/problemset/problem/734/B

k2, k3, k5, k6 = map(int, input().split())
min256 = min(k2, k5, k6)
result = min256 * 256
k2 -= min256

result += min(k2, k3) * 32

print(result)
