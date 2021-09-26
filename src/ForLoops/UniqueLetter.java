package ForLoops;

import java.util.Scanner;

public class UniqueLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a word:");
        String word= scan.nextLine().toLowerCase();
        System.out.print("Enter a letter:");
        char letter= scan.next().toLowerCase().charAt(0);

        int count=0;
        for(char ch:word.toCharArray()){
            if(letter==ch) count++;

        }
        if(count==0) System.out.println("Not found!");
        if(count==1) System.out.println("Unique");
        if(count>1) System.out.println("Not unique!");
    }
}
