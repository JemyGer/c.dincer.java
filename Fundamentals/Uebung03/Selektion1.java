/*
* Java Programm mit If-Anweisungen*/
import javax.swing.JOptionPane;
public class Selektion1 {
    public static void main(String[] args) {
        int alter;
        String eingabe;
        eingabe = JOptionPane.showInputDialog("Geben Sie ihr alter ein: ");
        alter = Integer.parseInt(eingabe);
        if (alter < 18) {
            JOptionPane.showMessageDialog(null, "Sorry, noch nicht volljährig!");
        } else {
            JOptionPane.showMessageDialog(null, "Glückwunsch! Sie sind volljährig!");
        }
    }
}