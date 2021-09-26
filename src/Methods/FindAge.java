package Methods;

import java.util.Scanner;

public class FindAge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age:");
        String str=scanner.nextLine();
        int age=Integer.parseInt(str.replaceAll("\\D",""));
        System.out.println("Your age is: "+age);
    }
}
