package Methods;

import java.util.Scanner;

public class FindCases {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your email:");
        String email= scanner.next();
        int upper=0,lower=0,num=0,other=0;
        upper=email.replaceAll("[^A-Z]","").length();//delete all except uppercase letters
        lower=email.replaceAll("[^a-z]","").length();//delete all except lowercase letters
        num=email.replaceAll("\\D","").length();//delete all non-digit characters
        other=email.replaceAll("[^\\W]","").length();//delete All non-word character: [a-zA-Z_0-9]
        System.out.println("Uppercase:"+upper);
        System.out.println("lowercase:"+lower);
        System.out.println("number:"+num);
        System.out.println("other:"+other);

    }
}
