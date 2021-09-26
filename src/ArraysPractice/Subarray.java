package ArraysPractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subarray {
    public static int sumOfArray(int[] arr) {
        int total=0;
        for (int i:arr) {
            total+=i;
        }

        return total;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String[][] chessBoard = new String[8][8];
        int sum1=0,sum2=0;
        for (int i = 0; i <3; i++) {
//            sum1+=matrix[i][i];
//            sum2+=matrix[i][3-i];
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            int step=0;
            for(char j='a';j<'i';j++){
                chessBoard[i][step]=""+(i+1)+j;
                step++;
            }
        }
        System.out.println(Arrays.deepToString(chessBoard));
        int L= scan.nextInt();
        int[] nums=new int[L];
        for(int j=0;j<L;j++){
            nums[j]= scan.nextInt();
        }

        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                System.out.println(i+":"+j);
                int arr[]=Arrays.copyOfRange(nums,i,j);
                if(sumOfArray(arr)<0) count++;
            }
        }
        System.out.println(count);


    }
}
