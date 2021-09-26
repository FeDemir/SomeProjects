package Methods;

import java.util.Scanner;

public class ArrayElementMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.print(firstElement(arr)+" ");
        System.out.println(midElement(arr)+" ");
        System.out.print(lastElement(arr)+" ");

    }
    public static int firstElement(int[] nums){
        return nums[0];
    }
    public static int lastElement(int[] nums){
        return nums[nums.length-1];
    }
    public static int midElement(int[] nums){
        if(nums.length%2==0) return (nums[nums.length/2-1]+nums[nums.length/2])/2;
        else return nums[nums.length/2];
    }
}
