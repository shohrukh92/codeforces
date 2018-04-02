# http://codeforces.com/problemset/problem/936/B
# TODO - TL in Test 9

G = {}
has_cycle = False
last_v = None
parents = {}
colors = {}
final_vs = []


def scanner(s):
    return map(int, s.split())


def dfs2(u):
    global G, last_v, has_cycle, final_vs, colors, parents
    stack = [u]

    while len(stack):
        v = stack.pop()
        if v in final_vs:
            last_v = v
            return

        for w in G[v]:
            if colors[w] == 0:
                stack.append(w)
                parents[w] = v

            elif colors[w] == 1:
                has_cycle = True

        colors[v] = 1


n, m = scanner(input())

for i in range(n):
    s0 = (i, 0)
    s1 = (i, 1)
    G[s0] = []
    G[s1] = []

    row = list(scanner(input()))
    ci = row[0]
    if ci == 0:
        final_vs.append((i, 0))
        continue
    for j in range(1, ci + 1):
        v = row[j] - 1
        G[s0].append((v, 1))
        G[s1].append((v, 0))

source = (int(input())-1, 1)
colors = {key: 0 for key in G.keys()}

dfs2(source)

if last_v:
    print('Win')
    current = last_v
    path = []
    while True:
        path.append(current[0] + 1)
        if current in parents:
            current = parents[current]
        else:
            break

    print(' '.join(map(str, reversed(path))))
elif has_cycle:
    print('Draw')
else:
    print('Lose')
