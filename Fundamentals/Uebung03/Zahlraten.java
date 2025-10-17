/*Zahlraten
* Das Programm soll den Anwender aufforden,
* eine ganze Zahl zwischen 0 und 10 zu erraten
* Die zu erratene Zahl ist ein Integer mit dem Wert 6
* Nach dem Starten des Programms soll mithilfe
* eines Dialogfensters eine ganze Zahl zwischen 0 und 10 abgefragt werden.
* Sollte dennoch eine höhere Zahl als 10 eingegeben werden, wird das als falsch angezeigt
* Wir verwendet hierzu eine Switch-Case Anweisung
* @autor C.Dincer
* @date 17.10.2025
* */

import javax.swing.JOptionPane;

public class Zahlraten {
    public static void main (String[] args){
        String eingabe;
        int errateneZahl = 6;
        eingabe =  JOptionPane.showInputDialog("Errate die richtige Zahl zwischen 0 und 10!");
        int benutzerZahl= Integer.parseInt(eingabe);
        switch(benutzerZahl){
            case 0:
            case 1:
            case 2:
            case 3:
                JOptionPane.showMessageDialog(null, benutzerZahl + ": Daneben!");
                break;
            case 4:
            case 5:
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null, benutzerZahl + ": Knapp deneben!");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, benutzerZahl + ": Treffer! Glückwunsch!");
                break;
            default:
                JOptionPane.showMessageDialog(null,  benutzerZahl +": Falsche eingabe! Wiederholen!");


        }
    }
}
