package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main  {
    public static String lameDb(String db, String op, String id, String data) {
        String [] arr=db.split("#?\\d");
        arr=Arrays.copyOfRange(arr,1,arr.length);
        String text="";
        if(op.equals("add")){
            if(Integer.parseInt(id)> arr.length){
                text+=""+db+"#"+id+data;
            } else {
                for (int i = 1; i < Integer.parseInt(id); i++) {
                    text+="#"+i+arr[i-1];
                }
                text+="#"+id+data;
                for (int i = Integer.parseInt(id)+1; i < arr.length+2; i++) {
                    text+="#"+i+arr[i-2];
                }

            }
        }
        if(op.equals("edit")){
            for (int i = 1; i <=arr.length; i++) {
                if(i==Integer.parseInt(id)){
                    text+="#"+i+data;
                }
                else text+="#"+i+arr[i-1];

            }
        }

        if(op.equals("delete")){
            for (int i = 1; i <=arr.length; i++) {
                if(i==Integer.parseInt(id)){
                    //text+="#";
                }
                else text+="#"+i+arr[i-1];

            }
        }
        if(text.charAt(1)=='2') return "#"+text;
        if(text.charAt(0)=='#') return text.substring(1);
        else return text;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb("1etsy#2wooden#3spoon","delete","1","bbb"));

    }
}
