// http://codeforces.com/contest/816/problem/B
// TODO 7 test - time limit

import java.util.Scanner;

public class JavaApplication1 {
    public static boolean isP(int a, int b) {
        int a1 = a/10;
        int a2 = a%10;
        
        int a3 = b/10;
        int a4 = b%10;
        
        if (a1 == a4 && a2 == a3) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int N = 200000;
        int n, k, q, l, r, a, b;
        n = keyboard.nextInt();
        k = keyboard.nextInt();
        q = keyboard.nextInt();
        
        int min = N + 10;
        int max = 0;
        int temps[] = new int[N+10];
        for (int i=0; i<n; i++) {
            l = keyboard.nextInt();
            r = keyboard.nextInt();
            
            if (l < min) min = l;
            if (r > max) max = r;
            
            for (int j=l; j<=r; j++) temps[j]++;
        }
        
        for (int i=0; i<q; i++) {
            a = keyboard.nextInt();
            b = keyboard.nextInt();
            
            int ans = 0;
            for (int j=a; j<=b; j++) if (temps[j] >= k) ans++;
            System.out.println(ans);
        }
    }
}
