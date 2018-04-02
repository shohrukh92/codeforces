# http://codeforces.com/contest/268/problem/B

n = int(input())
print(sum([(i+1) * (n-i) - i for i in range(n)]))