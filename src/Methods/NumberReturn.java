package Methods;

import java.util.Scanner;

public class NumberReturn {
    public static String covertNumverToWord(int num) {
        String[] text = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Twelve","Eleven", "Thirteen", "Fourteen", "Fifteen"};
        if (num >= 0&&num<16) return text[num];
        else return "Please enter a number 0-15";
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(covertNumverToWord(scan.nextInt()));
    }


    }

