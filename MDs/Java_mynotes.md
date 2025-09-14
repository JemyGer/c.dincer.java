# Java:
## Grundstruktur eines Programms
```` 
Importe > Klasse > main > Variablen > Eingabe > Logik > Ausgabe

- Importe (sofern es welche gibt (Gui, XML etc))
- Klasse (public class Name)
- main-Methode (public static void main)
- Varibalen deklarieren (Datentyp Name = Wert;)
- Eingabe einlesen
- Berechnung / Logik (if-else, Loops...)
- Ausgabe
````
## Datentypen
````
Primitive Datentypen:
- byte    1Byte       Ganzzahl -128 bis 127
- short   2Byte       Ganzzahl -32.768 bis 32.767
- int     4Byte       Ganzzahl -2^31 bis 2^31-1
- long    8Byte       Ganzzahl sehr groß
- float   4Byte       Kommazahl (ungefähr 7 Stellen)
- double  8Byte       Kommazahl (genauer 15 Stellen)
- char    2Byte       Ein Zeichen ('a', 'Z')
- boolean 1Bit        Wahrheitswert: true oder false
````
## Reihenfolge der Operatoren
````
Priorität       Operatoren              Beispiel
1               ()Klammern              ( 4 + 3 ) * 2
2               *,/,%                   3 * 4 / 2
3               +,-                     3 + 4 - 2
4               VergleichsOperatoren    <, >, <=, ==, !=
5               Logische Operatoren     && ( und ), || (oder)
6               Zuweisung               =

````
## Nicht-Primitive Datentypen
````
String
    speichert text, zb. "Hallo".
    ist eine klassem kein primitiver Datentyp > viele methoden verfügbar
    length(), substring(), equals() . . .
Arrays
    sammlung von werten gleichen typs,
    zb: int[] zahlen = {1,2,3};
    zugriff über index: zahlen [0] > 1
    länge: zahlen.length
EigeneKlassen/Objekte
    alles was du selbst definierst oder aus Bibliotheken kommt
    zb: Scanner für eingaben, JOptionPane für Dialoge
````
## Arithmetische Operatoren
````
- Minus (Vorzeichen) zahl = 3;
+ Plus (Vorzeichen)  zahl = 3; oder zahl = + 3;
+ Addition           zahl = 3 + 4;
- Subtraktion        zahl = 3 - 4;
/ Division           zahl = 12 / 4;

Modulo Operator
% Modulo Operator ( Restwert Operator )
  Modulo wird verwendet um Muster und Abläufe zu realisieren.
  zb: number = 32 % 3; // ergebnis: 2
````
## Vergleichs Operatoren
````
Operator    Beschreibung                Beispiel
<           kleiner als                 1 < 6 (true)
>           größer als                  1 > 6 (false)
<=          kleiner als oder gleich     4 <= 4 (true) oder 3 <= 4 (true)
>=          größer als oder gleich      4 >= 4 (true) oder 6 >= 4 (true)
==          gleich                      4 == 4 (true) oder 3 == 4 (false)
!=          ungleich                    4 != 4 (false) oder 3 != 4 (true)

````
## Escape-Sequenzen und Bedeutung
```` 
Escape-Sequenz      Bedeutung
\b                  Backspace
\t                  Tabulator
\n                  neue Zeile (Newline)
\f                  Seitenvorschub (Formfeed)
\r                  Wagenrücklauf (Carrige return)
\"                  doppeltes Anfurhungszeichen ""
\'                  einfaches Anführungszeichen ''
\\                  Backslash \
````