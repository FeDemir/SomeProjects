package ForLoops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinfJava {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter message:");
        String str=scan.nextLine();
        Pattern pattern=Pattern.compile("java*", Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(str);
        int countJava=0;
        while(matcher.find()){
            countJava++;
        }

        pattern=Pattern.compile("python*");
        matcher.reset();
        matcher=pattern.matcher(str);
        int countPython=0;
        while(matcher.find()){
            countPython++;
        }
        System.out.println(countJava+" "+countPython);
    }
}
