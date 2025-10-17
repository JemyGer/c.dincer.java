/* Mini-Calculator
* Berechnung von 3 Grundrechen Operatoren
* Wir berechnen jeweils 2 Zahlen miteinander
* diese werden entweder mit addiert subtrahiert oder multipliziert
* Die eingabe und die ausgabe zeigen wir mit einem InputDialog
* */
import javax.swing.*;

public class MiniCalculator {
    public static void main(String[] args){
            String eingabeEins;
            eingabeEins = JOptionPane.showInputDialog("Gebe die erste Zahl ein!");
            int ersteZahl = Integer.parseInt(eingabeEins);

            String eingabeOperator;
            eingabeOperator = JOptionPane.showInputDialog("wähle + - oder *");

            String eingabeZwei;
            eingabeZwei = JOptionPane.showInputDialog("Gebe die zweite Zahl ein!");
            int zweiteZahl = Integer.parseInt(eingabeZwei);

            char operatorBerechnen = eingabeOperator.charAt(0);
            switch(operatorBerechnen){
                case '+':
                    JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + (ersteZahl + zweiteZahl));
                    break;
                case '-':
                    JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + (ersteZahl - zweiteZahl));
                    break;
                case '*':
                    JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + (ersteZahl * zweiteZahl));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ungültiger Operator");
            }
        }
    }

