// http://codeforces.com/problemset/problem/638/B

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static ArrayList<String> words = new ArrayList<>();
    
    public static void check(String curr){
        int len;
        len = words.size();
        for(int i=0; i<len; i++){
            String word = words.get(i);
            
            if (word.contains(curr)){
                curr = word;
                words.remove(i--);
                len--;
            }
            else if (curr.contains(word)){
                words.remove(i--);
                len--;
            }
            else {//not substr each other => search by char
                int currLen = curr.length();
                int wordLen = word.length();

                //word left search
                String lw = word.substring(0,1);
                int leftIndex = curr.indexOf(lw);
                
                if (leftIndex > -1) { //found => merge, delete word
                    String lc = curr.substring(0, leftIndex);
                    curr = lc + word;
                    words.remove(i--);
                    len--;
                }
                else { //left not found, search right
                    String rw = word.substring(wordLen-1, wordLen);
                    int rightIndex = curr.indexOf(rw);
                    
                    if (rightIndex > -1) {//found => merge, delete word
                        String rc = curr.substring(rightIndex+1, currLen);
                        curr = word + rc;
                        words.remove(i--);
                        len--;
                    }          
                }
            }            
        }
        words.add(curr);
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int i,j,n = kb.nextInt();
        kb.nextLine();
        String curr = kb.nextLine();
        words.add(curr);
        
        for(i=0; i<n-1; i++){
            curr = kb.nextLine();
            check(curr);
        }
        
        for(i=0; i<words.size(); i++){
            System.out.print(words.get(i));
        }
        System.out.println("");
    }
    
}
