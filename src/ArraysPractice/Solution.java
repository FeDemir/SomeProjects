package ArraysPractice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static int sumOfArray(int[][] arr) {
        int total=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                total+=arr[i][j];
            }
        }
        return total;
    }
    public static int sumOfArray(int[] arr) {
        int total=0;
        for(int i=0;i<arr.length;i++){
            //for(int j=0;j<3;j++){
                total+=arr[i];
            //}
        }
        return total;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);

        int[][] num=new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                num[i][j]=scan.nextInt();
            }
        }
        int max=-1000;
        int[][] arr=new int[3][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[0][0]=num[i][j];
                arr[0][1]=num[i][j+1];
                arr[0][2]=num[i][j+2];
                arr[1][1]=num[i+1][j+1];
                arr[2][0]=num[i+2][j];
                arr[2][1]=num[i+2][j+1];
                arr[2][2]=num[i+2][j+2];
                if(sumOfArray(arr)>max) max=sumOfArray(arr);
            }
        }
        System.out.println(max);



    }
}

