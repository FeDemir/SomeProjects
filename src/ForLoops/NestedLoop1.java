package ForLoops;

public class NestedLoop1 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print("outer"+i+"\t");
            for(int j=0;j<10;j++){
                System.out.print("inner"+j+"\t");
            }
            System.out.println("outer"+i);
        }
    }
}
