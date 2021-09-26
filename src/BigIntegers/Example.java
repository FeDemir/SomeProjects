package BigIntegers;

import java.math.BigInteger;
import java.util.Scanner;

public class Example
{

    public static void main(String args[]) throws Exception
    {
        Scanner scan=new Scanner(System.in);
        String a= scan.next();
        String b= scan.next();
        BigInteger A= new BigInteger(a);
        BigInteger B= new BigInteger(b);
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
//        A  = new BigInteger(“54”);
//        B  = new BigInteger(“123456789123456789”);
        String str="12345678";
        BigInteger C = A.add(new BigInteger(str));
        int val  = 123456789;
        C = A.add(BigInteger.valueOf(val));
        int x   =  A.intValue();   // value should be in limit of int x
        long y   = A.longValue();  // value should be in limit of long y
        String z = A.toString();
        if (a.equals(b)) {}         // For primitive int
        if (A.compareTo(B) < 0)  {} // For BigInteger
        if (A.equals(B)) {}  // A is equal to B
        int N = 200;
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        System.out.println(f);
    }
}
