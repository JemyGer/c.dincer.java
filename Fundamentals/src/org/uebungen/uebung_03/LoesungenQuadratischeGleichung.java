
import javax.swing.JOptionPane;
public class LoesungenQuadratischeGleichung {
    public static void main(String[] args) {
        String eingabeA = JOptionPane.showInputDialog("Gib a ein");
        double a = Double.parseDouble(eingabeA);

        String eingabeB = JOptionPane.showInputDialog("Gib b ein");
        double b = Double.parseDouble(eingabeB);

        String eingabeC = JOptionPane.showInputDialog("Gib c ein");
        double c = Double.parseDouble(eingabeC);

       double D = b * b - 4 * a * c;

       if (D > 0) {
           JOptionPane.showMessageDialog(null, "D > 0: Die Gleichung hat zwei Lösungen");
       } else if (D == 0) {
            JOptionPane.showMessageDialog(null,"D = 0: Die Gleichung hat eine Lösung");
       } else {
           JOptionPane.showMessageDialog(null, "D < 0: Die Gleichung hat keine Lösung");
       }
    }
}
