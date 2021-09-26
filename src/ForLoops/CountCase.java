package ForLoops;

import java.util.Scanner;

public class CountCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter text:");
        String str= scan.nextLine();
        int upper=0;
        int lower=0;
        int number=0;
        for(char i:str.toCharArray()){
            if(i>='0' && i<='9') number++;
            if(i>='a' && i<='z') lower++;
            if(i>='A' && i<='Z') upper++;
        }
        System.out.println("Number count="+number);
        System.out.println("Lower  count="+lower);
        System.out.println("Upper count="+upper);


    }
}
