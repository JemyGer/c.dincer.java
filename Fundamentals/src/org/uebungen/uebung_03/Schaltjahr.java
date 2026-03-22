// Überorüfe ob das Jahr ein Schaltjahr ist oder nicht.
import javax.swing.JOptionPane;
public class Schaltjahr {
    public static void main(String[] args) {
        String inputYear = JOptionPane.showInputDialog("Gebe eine Jahreszahl ein!");
        int year = Integer.parseInt(inputYear);

        // Berechnung mit Modulo Operator
        boolean  isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        // Ausgabe
        if (isLeap) {
            JOptionPane.showMessageDialog(null, year + " ist ein Schaltjahr");
        } else {
            JOptionPane.showMessageDialog(null, year + " ist kein Schaltjahr");
        }
    }

}