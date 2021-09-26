package Methods;

public class ReverseString {
    public static String reverseString(String str){
        String text="";
        for (char i:str.toCharArray()) {
            text=i+text;
        }
        System.out.println(text);
        return text;
    }
    public static String reverseCase(String str){
        String text="";
        for (char i:str.toCharArray()) {

            if(i>='a'&&i<='z') text+=(char)(i-32);
            else if(i>='A'&&i<='Z') text+=(char)(i+32);
            else text+=i;
        }
        return text;
    }


}
