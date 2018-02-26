http://codeforces.com/contest/523/problem/C
#include <stdio.h>
#include <string.h>
int main() {
    char curr, s[1010];
    char t[1000010];
    int i = 0;
    fgets(s, sizeof s, stdin);
    int slen = strlen(s)-1;

    int index = 0;
    int first_pos = -1;
    int ti = 0;

    while(1){
        scanf("%c", &curr);
        if (curr == '\n') break;
        if (s[index] == curr){
            index++;
        }
        if (index == slen){
            first_pos = ti;
            break;
        }
        ti++;
    }
    if (first_pos > -1){
        fgets(t, sizeof t, stdin);
        int tlen = strlen(t);
        int last_pos = -1;
        int r = ti+1;
        index = slen-1;
        for(ti = tlen-2; ti >= 0; ti--){
            if (t[ti] == s[index]){
                index--;
            }
            if (index == -1){
                last_pos = ti;
                break;
            }
        }

        if (last_pos < 0) printf("0");
        else printf("%d", r + last_pos - first_pos);
    }
    else{
        printf("0");
    }

    return 0;
}
