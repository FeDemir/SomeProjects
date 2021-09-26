package ForLoops;

public class MultuplicationTable {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            //System.out.print("outer"+i+"\t");
            for(int j=1;j<=10;j++){

                System.out.println(i+"x"+j+"="+i*j+"\t");
                break;
            }
            System.out.println();
        }
    }
    }

