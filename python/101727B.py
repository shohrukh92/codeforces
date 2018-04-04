# http://codeforces.com/gym/101727/problem/B

s = input()

p2 = set()
p3 = set()

for i in range(1, len(s)-1):
    if s[i] == s[i+1]: p2.add(s[i] + s[i+1])

    if not len(p2):
        if s[i-1] == s[i+1]: p3.add(s[i-1] + s[i] + s[i+1])

if s[0] == s[1]: p2.add(s[0] + s[1])

if len(p2): print(sorted(list(p2))[0])
elif len(p3): print(sorted(list(p3))[0])
else: print(-1)
