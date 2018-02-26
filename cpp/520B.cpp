http://codeforces.com/contest/520/problem/B

#include <stdio.h>

int main(){
    int n,m;
    scanf("%d %d", &n, &m);
    int ans = 0;
    if (n > m){
        ans = n-m;
    }
    else if (n == m){
        ans = 0;
    }
    else{
        while(1){
            if (m % 2 == 1) {
                m++;
            }
            else {
                m /= 2;
            }
            ans++;
            if (m < n){
                ans += n - m;
                break;
            }
            else if (n == m){
                break;
            }
        }
    }
    printf("%d\n", ans);
    return 0;
}
