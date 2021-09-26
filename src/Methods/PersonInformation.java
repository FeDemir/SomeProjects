package Methods;

import java.util.Locale;
import java.util.Scanner;

public class PersonInformation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Name and Last Name:");
        String name= scan.nextLine().replaceAll(" ","_").toLowerCase();
        System.out.println("Enter Domain:");
        String domain= scan.nextLine();
        System.out.println("Email address: "+createEmail(name,domain));
    }
    public static String createEmail(String name, String domain){
        return name+"@"+domain.toLowerCase()+".com";
    }
}
