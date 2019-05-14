
/*
0424 Drei Zahlen
Eingaben über die Tastatur, Vergleich von Zahlen und Ausgabe auf dem Bildschirm -
für Schüler der 4. Stufe des Geheimzentrums JavaRush sind diese Fähigkeiten auf Automatismus ausgelegt.
Schreiben wir ein Programm, in dem der Benutzer drei Zahlen über die Tastatur eingibt.
Dann erfolgt ein Vergleich, und wenn wir eine Zahl finden, die sich von den beiden anderen unterscheidet,
Zeigen Sie die Sequenznummer an.

Anforderungen:
1. Das Programm muss die Zahlen von der Tastatur lesen.
2. Das Programm sollte die Befehle System.out.println () oder System.out.print () verwenden.
3. Das Programm sollte die laufende Nummer einer anderen Nummer anzeigen.
4. Wenn alle Zahlen unterschiedlich sind, geben Sie nichts aus.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String n1 = reader.readLine();
            int a = Integer.parseInt(n1);
            String n2 = reader.readLine();
            int b = Integer.parseInt(n2);
            String n3 = reader.readLine();
            int c = Integer.parseInt(n3);
            if (a != b && a != c && b != c);
            else {
                if (a == b && (a != c && b != c))

                    System.out.println(3);

                else {

                    if (a == c && (a != b && c!= b))
                        System.out.println(2);
                    else {
                        if (b == c && (b != a && c != a))
                            System.out.println(1);
                    }}}
        }
    }
