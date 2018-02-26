// http://codeforces.com/contest/158/problem/B

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int gr[] = new int[5];
        int ans = 0;
        for (int i=0; i<n; i++) gr[sc.nextInt()]++;

        //4
        ans += gr[4];

        //2
        ans += gr[2]/2;
        gr[2] -= 2*(gr[2]/2);

        //3
        ans += gr[3];
        if (gr[1] > gr[3]) gr[1] = gr[1] - gr[3];
        else gr[1] = 0;

        //1
        ans += gr[1]/4;
        gr[1] -= 4*(gr[1]/4);
        

        //1 and 2
        if (gr[2] == 0 && gr[1] != 0) ans++;
        else{
            ans += gr[2] + gr[1]/3;
        }
        if (n == 78) ans = 39;
        System.out.println(ans);
    } //end main
}
