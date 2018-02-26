// http://codeforces.com/contest/522/problem/A

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Map<String, Integer> map = new HashMap<String, Integer>();
        String name1 = sc.next().toLowerCase();
        sc.next();
        String name2 = sc.next().toLowerCase();
        map.put(name1, 2);
        map.put(name2, 1);

        int max = 2;
        for(int i=1; i<n; i++){
            name1 = sc.next().toLowerCase();
            sc.next();
            name2 = sc.next().toLowerCase();

            int new_val = map.get(name2)+1;
            map.put(name1, new_val);
            if (new_val > max) max = new_val;
        }

        System.out.println(max);
    }
}
