// http://codeforces.com/contest/816/problem/C
// TODO 12 test - WA

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, m, g;
        n = keyboard.nextInt();
        m = keyboard.nextInt();
        
        int arr[][] = new int[n][m];
        
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        
        int moves = 0;
        boolean empty = true;
        for (int i=0; i<n; i++) {
            int min_row = 1000;
            for (int j=0; j<m; j++) {
                g = keyboard.nextInt();
                if (g > 0) empty = false;
                arr[i][j] = g;
                if (g < min_row) min_row = g;
            }
            for (int p=0; p<min_row; p++) {
                rows.add(i+1);
                moves++;
            }
            for (int j=0; j<m; j++) {
                arr[i][j] -= min_row;
            }
        }
        for (int j=0; j<m; j++) {
            int min_col = 1000;
            for (int i=0; i<n; i++) {
                g = arr[i][j];
                if (g < min_col) min_col = g;
            }
            for (int p=0; p<min_col; p++) {
                cols.add((j+1));
                moves++;
            }
        }
        
        if (empty) System.out.println(0);
        else {
            if (moves == 0) System.out.println(-1);
            else {
                System.out.println(moves);
                for(int i=0, s=rows.size(); i<s; i++) System.out.println("row " + rows.get(i));
                for(int i=0, s=cols.size(); i<s; i++) System.out.println("col " + cols.get(i));
            }
        }
    }
}
