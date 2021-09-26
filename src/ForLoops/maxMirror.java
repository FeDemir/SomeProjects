package ForLoops;

import java.util.Arrays;

public class maxMirror {
    public static void main(String[] args) {
        String[] arr={"a", "c", "z" , "b", "f", "z"};
        Arrays.stream(arr).sorted();
        System.out.println(Arrays.toString(arr));

        int z=211112;
        String a="bb";
        String b="zz";
        //System.out.println(bi.compareTo(b));
        System.out.println();
        for(int i=5;i>0;i--){
            z+=i;
        }
        System.out.println(z);
    }
    }

