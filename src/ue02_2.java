import libraries.In;
import libraries.Out;

/*
 * Erstellen Sie ein Java-Programm, welches eine Jahreszahl und einen
 * Monats-Wert zwischen 1 und 12 einliest und die Anzahl der Tage des
 * zugehörigen Monats wieder ausgibt. Verwenden Sie eine
 * „switch/case“-Anweisung.
 * Beachten Sie auch die Schaltjahres-Regel für den Februar: Ein Schaltjahr ist
 * alle vier Jahre, jedoch alle 100 Jahre nicht, dann aber alle 400 Jahre doch.
 * Beispiel Schaltjahre: 1988, 2000, 2020
 * Beispiel Nicht-Schaltjahre: 1900, 1999, 2022
 * Überprüfen Sie auch, ob die eingegebenen Werte im gültigen Bereich liegen,
 *und geben Sie ansonsten eine Fehlermeldung aus.
 */

public class ue02_2 {
    public static void main(String[] args) {

        Out.println("Please enter a month (number from 1-12):");
        int month = In.readInt();

        Out.println("Please enter a year");
        int year = In.readInt();

        int gerade_monate = 30;
        int ungerade_monate =31;

        int schaltjahr_februar = 29;
        int kein_schaltjahr_februar = 28;

        switch (month) {
            case 1:
                System.out.println("Jaenner " + ungerade_monate);
                break;
            case 2:
                if( year  % 400 == 0 && year % 100 == 0){
                    System.out.println("Das Jahr " + year + " ist ein Schaltjahr und hat daher " + schaltjahr_februar + " Tage");
                    break;
                }
                if(year % 4 == 0 && year % 100 != 0){
                    System.out.println("Das Jahr " + year + " ist ein Schaltjahr und hat daher " + schaltjahr_februar + " Tage");
                    break;
                }
                else{
                    System.out.println("Das Jahr " + year + " ist kein Schaltjahr und hat daher " + kein_schaltjahr_februar + " Tage");
                    break;
                }
            case 3:
                System.out.println("März " + ungerade_monate);
                break;
            case 4:
                System.out.println("April " + gerade_monate);
                break;
            case 5:
                System.out.println("Mai " + ungerade_monate);
                break;
            case 6:
                System.out.println("Juni " + gerade_monate);
                break;
            case 7:
                System.out.println("Juli " + ungerade_monate);
                break;
            case 8:
                System.out.println("August " + gerade_monate);
                break;
            case 9:
                System.out.println("September " + ungerade_monate);
                break;
            case 10:
                System.out.println("Oktober " + gerade_monate);
                break;
            case 11:
                System.out.println("November " + ungerade_monate);
                break;
            case 12:
                System.out.println("Dezember " + gerade_monate);
                break;
        }
    }
}