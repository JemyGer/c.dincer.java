import javax.swing.JOptionPane;
public class Zahlentest {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Gib eine Zahl vom Typ double ein");
        double zahl = Double.parseDouble(eingabe);
        if (zahl < 0) {
            JOptionPane.showMessageDialog(null, zahl +" Zahl ist negativ");
        } else {
            JOptionPane.showMessageDialog(null, zahl+" Zahl ist nicht negativ");
        }
    }
}
