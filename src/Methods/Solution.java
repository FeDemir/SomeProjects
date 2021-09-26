package Methods;

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int n=game.length;
        int count=0;
        for(int i:game){
            if(i!=0)count++;
            if(count>=leap) return false;
            if(i==0) count=0;
        }
        //return true;
        boolean check=true;
         int step=0;
         while(check){
             if(step+leap>=n) return true;
             else if(game[step+leap]==0) step+=leap;
             else if(game[step+1]==0) step++;

             //else if(step>0&&game[step-1]==0&&game[step-1+leap]==0) step=step+leap-1;
             else check=false;
         }
         return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

