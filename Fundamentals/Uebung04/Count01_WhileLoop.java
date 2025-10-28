/*
* While - Schleife
* Zählen von 0 bis 100
* die Schleife wird so lange ausgeführt solang
* die Bedingung wahr ist
* Wenn die Bedingung falsch ist dann wird das programm beendet
* @autor C.Dincer
* */
public class Count01_WhileLoop {
    public static void main (String[] args){
        int zahl = 0;
        while ( zahl < 101) {
            System.out.println(zahl);
            zahl++;
        }
    }
}
