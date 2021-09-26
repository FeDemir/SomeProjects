package Methods;

import java.util.Scanner;

public class regex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String str=sc.next();
            //Complete the code
            str=str.replaceAll("\\(+.*\\)","");
            str=str.replaceAll("\\[+.*\\]","");
            str=str.replaceAll("\\{+.*\\}","");
            //System.out.println(str);
            System.out.println(str.isEmpty());
            //st.push(input);
            //sc.nextLine();
        }
    }
}
