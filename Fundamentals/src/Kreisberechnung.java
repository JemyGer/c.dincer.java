/*
* Kreisberechnung: Für einen Kreis mit dem Radius 5 cm
* werden der Umfang und die Fläche berechnet. */
public class Kreisberechnung {
    public static void main (String[] args) {
        double radius = 5.0;
        double umfang = 2.0 * 3.145926 *radius;
        double inhalt = 3.145926 * radius * radius;
        System.out.println("Umfang: " + umfang);
        System.out.println("Flaeche: " +inhalt);
    }
}

