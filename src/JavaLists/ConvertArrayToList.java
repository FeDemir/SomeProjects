package JavaLists;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer [] a={1,2,3,4,5};
        String [] str={"1","nanuk","3","5"};
        System.out.println(Integer.parseInt(str[0]));

        Arrays.asList(a);//this allows us to convert from the array to the arrayList
        System.out.println(Arrays.asList(a));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
        System.out.println(list);
        //creating an array with values right away
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(9,8,7,6,5,4));
        System.out.println("List2 Size:"+list2.size()+"\nList2:"+list2);
        int[] r={1,2,3,4,5,6,7,8,9};
        int[] arr=new int[r.length+1];
        arr=Arrays.copyOfRange(r,0,r.length+1);
        arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));
        for (int i:list2) {
            System.out.print(i+"\t");

        }
    }
}
