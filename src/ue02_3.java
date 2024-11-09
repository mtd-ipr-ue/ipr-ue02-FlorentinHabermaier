import libraries.In;
import libraries.Out;

/* Gegeben ist ein Kreis mit dem Radius r = 4 und dem Mittelpunkt (0,0):
 * Schreiben Sie ein Java-Programm, das die x- und y-Koordinaten (double)
 * eines Punktes einliest und feststellt, ob der Punkt innerhalb der grünen Fläche
 * liegt.
 * Überlegen Sie eine sinnvolle Abfolge der zu prüfenden Bedingungen.
 * Anmerkung: √𝑥 = Math.sqrt(x)
 */

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
