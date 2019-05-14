
/*
0426 Etiketten und Nummern
        Geben Sie eine Ganzzahl über die Tastatur ein. So zeigen Sie die Zeichenfolgenbeschreibung in der folgenden Form an:
        "Negative gerade Zahl" - wenn die Zahl negativ und gerade ist,
        "Negative ungerade Zahl" - wenn die Zahl negativ und ungerade ist,
        "Null" - wenn die Zahl 0 ist,
        "Positive gerade Zahl" - wenn die Zahl positiv und gerade ist,
        "Positive ungerade Zahl" - wenn die Zahl positiv und ungerade ist.

        Beispiel für die Nummer 100:
        positive gerade Zahl

        Beispiel für die Nummer -51:
        negative ungerade Zahl

        Anforderungen:
        1. Das Programm muss die Nummer von der Tastatur lesen.
        2. Das Programm sollte den Befehl System.out.println () oder System.out.print () verwenden.
        3. Wenn die Zahl negativ und gerade ist, geben Sie "negative gerade Zahl" aus.
        4. Wenn die Zahl negativ und ungerade ist, geben Sie "negative ungerade Zahl" aus.
        5. Wenn die Zahl 0 ist, geben Sie "Null" aus.
        6. Wenn die Zahl positiv und gerade ist, geben Sie "positive gerade Zahl" aus.
        7. Wenn die Zahl positiv und ungerade ist, geben Sie "positive ungerade Zahl" aus.

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n == 0)
            System.out.println("Null");
        else if (n > 0) {
            if (n % 2 == 0)
                System.out.println("positive gerade Zahl");
            else System.out.println("positive ungerade Zahl");
        }
        else {
                if (n % 2 == 0) System.out.println("negative gerade Zahl");
                else System.out.println("negative ungerade Zahl");
            }
        }
    }