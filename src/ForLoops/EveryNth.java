package ForLoops;

import java.util.Arrays;

public class EveryNth {
    public static void main(String[] args) {
        int[] nums=new int[10];
        System.out.println(Arrays.stream(nums).sorted());
        System.out.println(Arrays.stream(nums).allMatch(n->n==2||n==3));
        System.out.println(Arrays.stream(nums).sum());
        System.out.println(Arrays.stream(nums).max());
        String text="";
        String str="Miracle";
        int n=2;
        //if(str.length()<1) return str;
        for(int i=0;i<str.length();i=i+n){
            text+=str.charAt(i);
        }
        System.out.println(text);
    }
}
