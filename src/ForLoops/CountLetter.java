package ForLoops;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your message");
        String message=scan.nextLine();
        int count=0;
//        for(char letter:message.toCharArray()){
//            if(letter=='a') count++;
//        }


        for(int i=0;i<message.length();i++){
            if(message.charAt(i)=='a') count++;
            System.out.println(message.toCharArray()[i]);
        }

        System.out.println(count+" out of "+message.length()+" letters are a's");
    }
}
