# http://codeforces.com/gym/101733/problem/A

def split_str(s):
    return list(map(int, s.split()))

chosen_numbers = [False]*33
for num in split_str(input()):
    chosen_numbers[num] = True

n = int(input())
for i in range(n):
    current_ticket = split_str(input())
    current_count = 0

    for num in current_ticket:
        if chosen_numbers[num]: current_count += 1
        if current_count == 3: break

    if current_count == 3:
        print('Lucky')
    else:
        print('Unlucky')
