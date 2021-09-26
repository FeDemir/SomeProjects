package ForLoops;

import java.util.Scanner;

public class UniquesStrings {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string:");
        String str= scan.nextLine();
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) {
                    str=str.substring(0,j)+"ç"+str.substring(j+1);
                }
            }
        }
        if(str.indexOf("ç")>0) System.out.println(str.indexOf("ç")); else System.out.println(str.length());
        System.out.println(str);

    }
}
