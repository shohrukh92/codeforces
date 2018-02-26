// http://codeforces.com/contest/520/problem/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();
        String s = sc.nextLine().toLowerCase();


        int alf[] = new int[26];
        for (int i=0; i<n; i++){
            int code = (int)s.charAt(i)-97;
            alf[code]++;
        }

        String answer = "YES";
        for (int i=0; i<26; i++){
            if (alf[i] == 0) {
                answer = "NO";
                break;
            }
        }

        System.out.print(answer);
    }
}
