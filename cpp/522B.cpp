// http://codeforces.com/contest/522/problem/B

#include <stdio.h>

int main(){
   int hm1, hm2, W=0, hi, n, i, max_pos;
   int w[200010];
   scanf("%d", &n);
   scanf("%d %d", &w[1], &hm1);
   W += w[1];
   scanf("%d %d", &w[2], &hi);
   W += w[2];
   max_pos = 1;
   if (hi > hm1) {
      hm2 = hm1;
      hm1 = hi;
      max_pos = 2;
   }
   else {
      hm2 = hi;
   }
   
   for (i=3; i<=n; i++){
       scanf("%d %d", &w[i], &hi);
       W += w[i];
       if (hi > hm1){
            hm2 = hm1;
            hm1 = hi;
            max_pos = i;
       }
       else if (hi > hm2){
           hm2 = hi;
       }
   }
   for (i=1; i<=n; i++){
       int wi = W - w[i];
       if (i == max_pos){
           printf("%d ", wi*hm2);
       }
       else {
           printf("%d ", wi*hm1);
       }
   }
   return 0;
}
