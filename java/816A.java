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
        String hours = keyboard.nextLine();
        
        int h = Integer.parseInt(hours.substring(0,2));
        int m = Integer.parseInt(hours.substring(3,5));
        
        int minutes = 0;
        while(!isP(h, m)) {
            minutes++;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                    m = 0;
                }
            }
        }
        
        System.out.println(minutes);
    }
    
}
