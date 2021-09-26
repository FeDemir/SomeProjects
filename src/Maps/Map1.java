package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> languages=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        languages.put("Java", "a compiled high level, object");
        languages.put("Python", "nfoqwefwelj lwejnc wojn ow");
        languages.put("Algol", "kwnbfhwebhbfiwef");
        languages.put("Basic", "skdbfjwbbfeweonfowjn fo wowe ");
        System.out.println(languages.get("Java"));

        languages.put("Java","dsjbfoweenwe foe weo wow");
        System.out.println("Java new"+languages.get("Java"));
        System.out.println("Python new"+languages.put("Python","hchiwbw wcwiewiuwhefwejfjwefjwe"));
        System.out.println(languages.get("C#"));//Null
        languages.put("C#","jbdbsvonwvwe");
        if(languages.containsKey("C#"))
            System.out.println(languages.get("C#"));
        else {
            System.out.println("Language not found! \nEnter Language:");
            languages.put(scan.next(), scan.nextLine());
        }
        //====================================================================
        for (String key: languages.keySet()) {
            System.out.println(key);
        }
        for (String key: languages.values()) {
            System.out.println(key);
        }
        for (String key: languages.keySet()) {
            System.out.println(key+":"+languages.get(key));
        }
        languages.remove("Algol");
        if(languages.remove("C#",languages.get("C#")))
            System.out.println("Removed Successfully!");
        else System.out.println("Not removed");
        if(languages.remove("C#",languages.get("C#")))
            System.out.println("Removed Successfully!");
            else System.out.println("Not removed");
            if(languages.containsKey("Javascript"))
                System.out.println("Java already exits");
            else System.out.println("Javascript not found!");

    }

}
