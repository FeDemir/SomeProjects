package JavaLists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static int getDup(String[] r) {
        int count=0;
        boolean check=false;
        for(int i=0;i<r.length-1;i++){
            for(int j=0;j<r.length;j++){
                if(r[i].equals(r[j])) count++;
            }
            if(count<2) r[i]="";
            //System.out.println(Arrays.toString(r));
            count=0;
        }
        count=0;
        for (String i:r) {
            if(!i.equals("")) count++;
        }
        return count;





    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = {"1","g","aabb","7","7","2","aa","7"};
//                new String[in.nextInt()];
//        for(int i=0; i < strs.length; i++) {
//            strs[i] = in.next();
//        }

        System.out.println(getDup(strs));

    }

}
