package ForLoops;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        int[] nums={4, 2, 13, 2, 1, 13, 4};
        int [] a={1,3,4,5,6,7};
        int [] c=Arrays.copyOf(a,a.length);
        //c+=Arrays.copyOf(nums,nums.length);
        System.out.println(Arrays.stream(nums).sorted());
        //int total=0;
        if(Arrays.toString(nums).indexOf("1")<Arrays.toString(nums).indexOf("2",Arrays.toString(nums).indexOf("1")))

        System.out.println(Arrays.toString(nums).contains("4")&&Arrays.toString(nums).contains("1"));
//        for(int i=0;i<nums.length;i++){
//            //System.out.println(nums[i]);
//            if(nums[i]==2) total+=2; i++;
//
//        }
//        System.out.println(total);
//        if(total==8) System.out.println(true);
//        else System.out.println(false);
//
    }
}
