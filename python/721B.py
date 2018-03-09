# http://codeforces.com/problemset/problem/721/B

n, k = map(int, input().split())
passwords = [input() for i in range(n)]
real_psw = input()

def calc_time(total, k):
    return 5 * (total // k) + total

short_psw_count = len([psw for psw in passwords if len(psw) < len(real_psw)])
equal_psw_count = len([psw for psw in passwords if len(psw) <= len(real_psw)])

best_time = calc_time(short_psw_count, k) + 1
worst_time = calc_time(equal_psw_count - 1, k) + 1
print(best_time, worst_time)
