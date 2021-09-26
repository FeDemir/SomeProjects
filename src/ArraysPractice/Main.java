package ArraysPractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;
        for (int i = 0; i <3; i++) {
            result+=matrix[i][i]-matrix[i][2-i];
        }
        Arrays.fill(matrix,10);
        System.out.println(Arrays.deepToString(matrix));
        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
