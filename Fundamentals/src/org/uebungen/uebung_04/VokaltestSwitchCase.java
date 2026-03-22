/*
* Vokaltest mit switch - case
* Nach der Eingabe eines Zeichens wird geprüft,
* ob es sich um ein Vokal handelt
* Das Ergebnis wird in einem MessageDialog ausgegeben.
* Und wir erhalten dementsprechend ob es ein Vokal ist oder nicht
* @author C.Dincer
* @date 17.10.2025
* */

import javax.swing.JOptionPane;

public class VokaltestSwitchCase {
    public static void main (String[] args){
        String eingabe;
        char UmlautZeichen;
        eingabe = JOptionPane.showInputDialog("Geben sie einen Buchstaben ein:");
        UmlautZeichen = eingabe.charAt(0);
        switch(UmlautZeichen) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                JOptionPane.showMessageDialog(null, UmlautZeichen + " ist ein Vokal" );
                break;
            default:
                JOptionPane.showMessageDialog(null, UmlautZeichen + " ist kein Vokal");
        }

    }
}
