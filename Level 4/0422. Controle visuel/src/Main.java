import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/*
0423 Controle visuel
        Entrez le nom et l'âge du clavier. Si vous avez plus de 20 ans, écrivez «Et 18, ça suffit».

        Exigences:
        1. Le programme doit lire les lignes du clavier.
        2. Le programme doit utiliser la commande System.out.println () ou System.out.print ().
        3. Si vous avez plus de 20 ans, affichez le message "Et 18 ans suffit".
        4. Si l'âge est inférieur ou égal à 20 ans, rien en sortie.

 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if(age>20)
            System.out.println("Et 18 ans suffit");

    }
}
