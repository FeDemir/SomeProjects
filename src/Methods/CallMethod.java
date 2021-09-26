package Methods;
import java.util.ArrayList;
import java.util.Scanner;

import ArraysPractice.ArraList;
import ArraysPractice.Solution;
public class CallMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        int[] arr=new int[list.size()];
        for (int i=0;i<list.size();i++) {
            arr[i]= list.get(i);
        }
        System.out.println(Solution.sumOfArray(arr));
    }
}
