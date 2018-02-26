

import java.util.Scanner;

// http://codeforces.com/contest/158/problem/C

public class Main {
    public static String remove_dots(String s){
        while(true){
            int dots_pos = s.indexOf("..");
            if (dots_pos < 0) break;
            int i = 0;
            for(i=dots_pos-2; i>0; i--){
                if (s.charAt(i) == '/') break;
            }
            String temp = s.substring(dots_pos+3, s.length());
            s = s.substring(0, i+1);
            s += temp;
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();

        String curr = "/";
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            if ( s.equals("pwd") ) System.out.println(curr);
            else {
                s = s.substring(3, s.length());

                //absolute path
                if (s.charAt(0) == '/'){
                    curr = s + "/";
                }
                else{
                    curr += s + "/";
                }
                curr = remove_dots(curr);
            }
        } //end for

    } //end main
}
