package WhileLoops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        boolean check=true;

        String guests="";

        while(check){
            System.out.println("Please enter guest name:");
            guests+= scan.nextLine();
            System.out.println("Do you want to enter new guest name:");
            if(scan.nextLine().equalsIgnoreCase("yes")){
                guests+=", ";
            } else check=false;
        }
        System.out.println("Guest's list: "+guests);


        while(check) {
            System.out.println("Enter Item"+count+" and its price:");
            item=scan.nextLine();
            price=scan.nextDouble();
            shoppingListReport+="Item"+count+": "+item+" Price: "+price+", ";
            totalPrice+=price;
            System.out.println("Add one more item?");
            scan.nextLine();
            countinue=scan.nextLine();
            if(countinue.equalsIgnoreCase("yes")){
                check=true;
                count++;
            } else check=false;
        }
        System.out.println(shoppingListReport);
        System.out.println("Total price: "+totalPrice);
    }
}
