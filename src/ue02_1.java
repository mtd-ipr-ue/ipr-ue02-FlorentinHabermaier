import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {

        Out.println("Please enter a number:");
        int zahleins = In.readInt();

        Out.println("Please enter a number:");
        int zahlzwei = In.readInt();

        Out.println("Please enter a number:");
        int zahldrei = In.readInt();

        if(zahleins > zahlzwei && zahleins > zahldrei){
            Out.print("Die Zahl " + zahleins + " ist das maximum");
        }
        if(zahlzwei > zahleins && zahlzwei > zahldrei){
            Out.print("Die Zahl " + zahlzwei + " ist das maximum");
        }
        if(zahldrei > zahleins && zahldrei > zahlzwei){
            Out.print("Die Zahl " + zahldrei + " ist das maximum");
        }
    }
}
