# http://codeforces.com/problemset/problem/538/B

digits = list(map(int, list(input())))
max_len = max(digits)

answer = []
for i, d in enumerate(reversed(digits)):
    row = [10**i] * d + [0] * (max_len - d)
    answer.append(row)

result = ''
for j in range(max_len):
    result += str(sum([row[j] for row in answer])) + ' '

print(max_len)
print(result)
