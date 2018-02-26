// http://codeforces.com/contest/638/problem/C
// TODO 12 test - TL

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int u,v,i,n = kb.nextInt();
        ArrayList<String> answer = new ArrayList<>();
        //Map<Integer, Boolean> ALLr = new HashMap<>();
        boolean[] ALLr = new boolean[n+1];
        boolean[] cities = new boolean[n+1];        
        List[] adj = new List[n+1];
        for(i=0; i<=n; i++){ adj[i] = new ArrayList<>(); }
        
        for(i=0; i<n-1; i++){
            u = kb.nextInt();
            v = kb.nextInt();
            
            ArrayList<Integer> edgeV = new ArrayList<>(2);
            edgeV.add(v);
            edgeV.add(i + 1);
            
            ArrayList<Integer> edgeU = new ArrayList<>(2);
            edgeU.add(u);
            edgeU.add(i + 1);
            
            adj[u].add(edgeV);
            adj[v].add(edgeU);
        }
        
        int days = 0;
        int repaired = 0;
        int repairedPerDay;
        ArrayList<ArrayList<Integer>> currAdj;
        ArrayList<Integer> vj;
        
        while (repaired < n-1) {
            for(i=1; i<=n; i++){ cities[i] = false; }
            days++;
            repairedPerDay = 0;
            String currAns = "";
            for(i=1; i<=n; i++){
                if (cities[i]) continue;
                currAdj = (ArrayList<ArrayList<Integer>>) adj[i];
                int len = currAdj.size();
                
                for(int j=0; j<len; j++){
                    //0-city, 1-number, 2-repaired
                    vj = (ArrayList<Integer>) currAdj.get(j);
                    int cityVj = vj.get(0);
                    int vjget1 = vj.get(1);
                    
                    if (ALLr[vjget1] || cities[cityVj]) continue;
                    
                    currAdj.remove(j); //repair
                    
                    cities[cityVj] = cities[i] = true; //busy
                    repaired++;
                    repairedPerDay++;
                    currAns += " " + vjget1;
                    ALLr[vjget1] = true;
                    break;
                }                
            }//cities loop
            currAns = repairedPerDay + currAns;
            answer.add(currAns);
        }
        System.out.println(days);
        for(i=0; i<days; i++){
            System.out.println(answer.get(i));
        }
    }
    
}
