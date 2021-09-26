package ForLoops;

import java.util.Scanner;

public class FindHi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your message:");
        String str= scan.nextLine();
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            //if(str.charAt(i)=='h' && str.charAt(i+1)=='i') count++;//to do 1:
            //todo 1:
            if(str.substring(i,i+2).equalsIgnoreCase("hi")) count++;
        }
        System.out.println("You have "+count+" hi's in your message.");
        System.out.println();
                //for(char i:str.toCharArray())
    }
}
