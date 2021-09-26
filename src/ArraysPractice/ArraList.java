package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraList {
    public static void main(String[] args) {
        int[] num1=new int[3];
        int [] num2={1,2,3,4};
        num1=num2;
        System.out.println(Arrays.toString(num1));
        Scanner scan=new Scanner(System.in);
        ArrayList<String> numbers=new ArrayList<String>();
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i< n;i++){

            numbers.add(scan.nextLine());
            System.out.println(numbers.toString());
        }
        n= scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {


            String[] input= scan.nextLine().split(" ");
            int x=Integer.parseInt(input[0])-1;
            int y=Integer.parseInt(input[1]);
            try{
                String[] arr=numbers.get(x).split(" ");
                System.out.println(arr[y]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}
