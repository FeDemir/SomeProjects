package WhileLoops;

import java.util.Scanner;

public class Factoriels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter factoriel number:");
        int num= scan.nextInt();
        int count=1;
        double factoriel=1;
        while(count<=num){
            factoriel*=count;
            count++;
        }
        System.out.println(factoriel);

    }
}
