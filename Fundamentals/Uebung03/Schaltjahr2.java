// Überprüfe ob eine Jahreszahl eine Schaltjahr ist ( Vergleichs Operaoren verwenden).
import javax.swing.JOptionPane;
public class Schaltjahr2 {
    public static void main(String[] args) {
        String inputYear = JOptionPane.showInputDialog("Gebe eine Jahreszahl ein");
        int year = Integer.parseInt(inputYear);

        //Berechnung mit dem Modulo Operator und der Verketung des Booleans mit dem || oder && Operatoren.
        boolean isLeap;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
            JOptionPane.showMessageDialog(null, year + " ist ein Schaltjahr");
        } else {
            JOptionPane.showMessageDialog(null, year + " ist kein Schaltjahr");
        }
    }
}
