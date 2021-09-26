package Methods;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class CountingNumbers {
    public static void countToN(){
        for (int i = 0; i < 6; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void countToN(int n){
        for (int i = 0; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        countToN();
        countToN(10);
    }
}
