http://codeforces.com/contest/527/problem/A

import java.util.Scanner;

public class New_main {
    public static long a;
    public static long b;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a = in.nextLong(); b = in.nextLong(); //a > b

        long ans = 0;
        while(true){
            if (a % b == 0){
                ans += a/b;
                break;
            }
            else{
                ans++;
                minus();
            }
        }
        System.out.print(ans);
    }
    public static void minus(){
        long ta = Math.max(b, a-b);
        long tb = Math.min(b, a-b);
        a = ta; b = tb;
    }
}
