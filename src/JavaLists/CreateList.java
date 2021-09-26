package JavaLists;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        Scanner input=new Scanner(System.in);
        System.out.println("Size: "+ list.size());

//        if(list.isEmpty()) System.out.println("Yous hould add something to your list");
//        else System.out.println("You have some things in your list");
//        String keepAsking="";
        do {
            System.out.println("What do you want to add to your list?");
            String item=input.nextLine();
            list.add(item);
            System.out.println("Do you want to add something else to your list?");
            //
            // keepAsking=input.nextLine();
        } while (input.hasNext());
        System.out.println(list.toString());

    }
}
