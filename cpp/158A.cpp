// http://codeforces.com/contest/158/problem/A

#include <stdio.h>

int main(){
    int after, curr, i, j, n, k;
    int sum = 0;
    scanf("%d %d", &n, &k);
    for (i=1; i<=n; i++){
        scanf("%d", &curr);
        if (curr > 0) sum++;
        if (i == k) break;
    }
    for (j=i; j<n; j++){
        scanf("%d", &after);
        if (after < curr) break;
        if (after > 0) sum++;
    }
    printf("%d",sum);

    return 0;
}
