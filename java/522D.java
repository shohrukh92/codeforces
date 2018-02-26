// http://codeforces.com/contest/522/problem/D
// TODO 8 test - TL

import java.util.Scanner;

public class Main {
    public static int n,m;
    public static int arr1[];
    public static int arr2[][];

    public static void insert(int i, int x){
        int j = i-1;
        while(j > 0 && arr2[0][j] > x){
            arr2[0][j+1] = arr2[0][j];
            arr2[1][j+1] = arr2[1][j];
            j--;
        }
        arr2[0][j+1] = x;
        arr2[1][j+1] = i;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr1 = new int[n+10];
        arr2 = new int[2][n+10];

        for (int i=1; i<=n; i++){
            arr1[i] = sc.nextInt();
            insert(i, arr1[i]);
        }
        for (int i=0; i<m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = -1;
            int min_ans = 1000000;
            for (int j=l; j<=r; j++){
                int curr_a = arr1[j];

                int p;
                //binary search
                for (p=1; p<n; p++){
                    if (arr2[0][p] == curr_a) break;
                }
                if (arr2[0][p+1] == curr_a) {
                    if ( arr2[1][p] >= l && arr2[1][p+1] <= r){
                        ans = arr2[1][p+1] - arr2[1][p];
                        if (ans < min_ans) min_ans = ans;
                    }
                }
            }
            if (min_ans == 1000000) min_ans = -1;
            System.out.println(min_ans);
        }
    }
}
