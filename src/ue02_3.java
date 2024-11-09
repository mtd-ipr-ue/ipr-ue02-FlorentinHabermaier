import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Gib mir eine x Koordinate:");
        double x = In.readDouble();

        Out.println("Gib mir eine y Koordinate:");
        double y = In.readDouble();

        if(x < 0 || y < 0 || x > 4 || y > 4){
            Out.println("Die Koordinate liegt nicht in dem grünen Bereich");
        }
        else if (Math.sqrt(x*x + y*y) <= 4) {
            Out.println("Die Koordinate liegt nicht in dem grünen Bereich");
        }
        else{
            Out.println("Der Punkt ist im Grünen Bereich");
        }
    }
}
