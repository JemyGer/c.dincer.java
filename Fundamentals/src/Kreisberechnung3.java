/*
* Kreisberechnung: Für einen Kreis
* werden der Umfang und der Flächeninhalt berechnet.
* Der Radius wird beim Programmstart als erster Parameter und
* die Einheit wird als zweiter Parameter übergeben
* */
public class Kreisberechnung3 {
    public static void main (String[] args){
        String einheit = args[1];
        double radius = Double.parseDouble(args[0]);
        double umfang = 2.0 * 3.1415926 * radius;
        double flaeche = 3.1415926 * radius * radius;
        System.out.println("Umfang: " + umfang + einheit + " ");
        System.out.print("Fläche: " + flaeche + einheit);

    }
}
