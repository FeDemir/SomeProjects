package WhileLoops;

import java.util.Scanner;

public class Enter5Numbers {
    public static void main(String[] args) {
        int min=2147483647;
        int max=-2147483648;
        int count=0, num=0;
        Scanner scan=new Scanner(System.in);
        while(count<5){
            System.out.print("Enter a number: ");
            num= scan.nextInt();
            if(num>max) max=num;
            if(num<min) min=num;
            count++;
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
    }
}
