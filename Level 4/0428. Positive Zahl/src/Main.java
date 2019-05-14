/*
0428 Positive Zahl
        Geben Sie drei Ganzzahlen über die Tastatur ein.
        Die Anzahl der Ausgabenummern im ursprünglichen Satz.

        Beispiel für Zahlen -4 6 6:
        2

        Beispiel für Zahlen -6 -6 -3:
        0

        Anforderungen:
        1. Das Programm muss die Nummer von der Tastatur lesen.
        2. Das Programm sollte eine Nummer auf dem Bildschirm anzeigen.
        3. Das Programm sollte die Anzahl der positiven Zahlen im ursprünglichen Satz anzeigen.
        4. Wenn es keine positiven Zahlen gibt, sollte das Programm "0" ausgeben.

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x=0;
        if(a > 0)
            x++;
        if(b>0)
            x++;
        if(c>0)
            x++;
        System.out.println(x);
    }
}
