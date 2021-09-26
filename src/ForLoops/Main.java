package ForLoops;

import java.util.*;

class Main {
    public static int arraySum(int[] nums) {
        int sum=0;
        for (int i : nums) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.
        int count=0;
        while(arraySum(inhabitants)>0){
            System.out.println("Day "+count+" "+Arrays.toString(inhabitants));
            count++;
            int [] b = Arrays.copyOf(inhabitants,inhabitants.length);
            for (int i = 0; i < inhabitants.length; i++) {
                if((i>0&&b[i-1]==0)||(i<inhabitants.length-1&&b[i+1]==0))
                    inhabitants[i]=b[i]/2;
            }
        }
        System.out.println("Day "+count+" "+Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");






    }
}