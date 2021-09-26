package JavaLists;
import java.util.*;
public class Nanuk {
    public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) {
        int total=0;

        for(int i=0;i<r.size();i++){
            if(r.get(i).equals("nanuk")) {
                if(i<=way_stones&&total>=boast) return true;
                else return false;
            }
            else total+=Integer.parseInt(r.get(i));
        }
        return total>=boast;






    }

    // Do not touch below

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();
//        int stones = in.nextInt();
//        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("10","3","nanuk"));
//        for(int i=0; i < size; i++) {
//            list.add(in.next());
//        }

        System.out.println(nanuk(list,2,7));

    }
}
