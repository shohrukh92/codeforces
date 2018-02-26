// http://codeforces.com/contest/638/problem/A

#include <iostream>
using namespace std;

int main(){
	int n,a;
	cin>>n>>a;
	int ans;
	if(a%2 == 0) {
		ans = 1 + ( (n-a)/2 );
	}
	else {
		ans = 1 + (a/2);
	}
	cout<<ans<<endl;
	return 0;
}
