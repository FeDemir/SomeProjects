package ForLoops;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class UniquesChars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String str= scan.nextLine();
        int check=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) check++;
            }
            if(check==1) System.out.println(str.charAt(i));
            check=0;
        }
    }
}
