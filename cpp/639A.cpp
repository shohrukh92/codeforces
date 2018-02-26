// http://codeforces.com/problemset/problem/639/A

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int* ti;
int que[7];
int qi = 0; //tail

void addQue(int id){
    int i,j;
    for(i=0; i<qi; i++){
        if (ti[id] > ti[ que[i] ])
            break;
    }
    for(j=qi; j>i; j--){
        que[j] = que[j-1];
    }
    que[i] = id;
    if (qi < 6) qi++;
}

int main(){


    int n,k,q;
    cin>>n>>k>>q;

    ti = new int[n+1];
    int i,j;
    for(i=1; i<=n; i++){
        cin>>ti[i];
    }

    int type, id;
    for(i=1; i<=q; i++){
        cin>>type>>id;
        if (type == 1){ //go online
            addQue(id);
        }
        else { //type == 2, check if online
            for (j=0; j<k; j++){
                if (que[j] == id) {
                    cout<<"YES\n";
                    break;
                }
            }
            if (j == k) {
                cout<<"NO\n";
            }
        }
    }
    return 0;
}
