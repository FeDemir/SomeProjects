package WhileLoops;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class FindSum {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        //BigInteger s = bufferedReader.BigInteger();
        //System.out.println(s.isProbablePrime(1) ? "prime" :"not prime");
        //bufferedReader.close();
        Scanner scan=new Scanner(System.in);
        boolean check=true;
        long total=0;
        int num=0;
        String name;
        //name.
        while(check){
            System.out.print("Enter Number: ");
            num=scan.nextInt();
            if(num>0) total+=num;
            else check=false;
        }
        System.out.println(total);
    }
}
