# http://codeforces.com/problemset/problem/476/B

from collections import Counter
from math import factorial

s1 = input()
s2 = input()

def prob(n, k):
    # binomial distribution
    if n < k: return 0
    den = factorial(n-k) * factorial(k) * 2**n
    return factorial(n) / den

ps1 = Counter(s1)['+']
ps2 = Counter(s2)['+']
nq2 = Counter(s2)['?']
diffp = ps1 - ps2

ans = 0
if diffp >= 0: ans = prob(nq2, diffp)

print('%0.12f' % ans)
