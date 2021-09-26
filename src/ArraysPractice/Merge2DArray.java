package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2DArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int L= scan.nextInt();
        int H= scan.nextInt();
        int[][] nums=new int[H][L];
        for(int i=0;i<H;i++){
            for(int j=0;j<L;j++){
                nums[i][j]= scan.nextInt();
            }
        }
        for (int[] i:nums
             ) {
            System.out.println(Arrays.toString(i));
        }


        int size=H*L;
        System.out.println(Arrays.deepToString(nums));
        int[] arr=new int[size];
        int step=0;
        for(int k=0;k<nums.length;k++) {
            for (int i : nums[k]) {
                arr[step] = i;
                step++;
            }
        }
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(Arrays.toString(arr));
    }
}
