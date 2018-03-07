# http://codeforces.com/problemset/problem/723/B
# s = '_Hello_Vasya(and_Petya)__bye_(and_OK)'
# длину самого длинного слова вне скобок (выведите 0, если слов вне скобок нет),
# количество слов внутри скобок (выведите 0, если слов внутри скобок нет).
# did not use regular expressions

input('')
s = input('')

def tokenize(s_input):
    s_input = s_input.replace('(', '_').replace(')', '_')
    return [x for x in s_input.split('_') if x != '']

mask = []
inside_brackets = False
for i, c in enumerate(s):
    if c == '(': inside_brackets = True
    elif c == ')': inside_brackets = False
    
    if inside_brackets: mask.append(1)
    else: mask.append(0)

s_inside = s_outside = ''

for i, c in enumerate(s):
    if mask[i] == True: s_inside += c
    else: s_outside += c

inside_words = tokenize(s_inside)
outside_words = tokenize(s_outside)

a1 = 0 if not len(outside_words) else max([len(s) for s in outside_words])
a2 = len(inside_words)
print('{} {}'.format(a1, a2))
