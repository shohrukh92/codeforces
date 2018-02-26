// http://codeforces.com/contest/816/problem/D
// TODO 6 test - time limit

import java.math.BigInteger;
import java.util.Scanner;

public class JavaApplication1 {
    public static BigInteger arr[];
    public static int sign = 1;
    public static int r;

    public static void reduce() {
        for (int i=0; i<r-1; i++) {
            if (sign == 1) arr[i] = arr[i].add(arr[i+1]);
            else arr[i] = arr[i].subtract(arr[i+1]);
            sign *= -1;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        n = keyboard.nextInt();
        arr = new BigInteger[n+1];
        r = n;
        BigInteger sum = new BigInteger("0");
        BigInteger div = new BigInteger("1000000007");
        
        for (int i=0; i<n; i++) {
            arr[i] = new BigInteger(String.valueOf(keyboard.nextInt()));
        }
        
        for (int i=0; i<n; i++) {
            reduce();
            r--;
        }
        
        BigInteger amb = arr[0].remainder(div);
        System.out.println(div.add(amb).remainder(div));
    }
}
