
/*
0429 Nombres positifs et négatifs
        Entrez trois nombres entiers du clavier.
        Pour afficher la quantité de nombres positifs et la quantité  de nombres négatifs dans le jeu d'origine,
        sous la forme suivante:
        "La quantité  de nombres négatifs: a", "la quantité de nombres positifs: b",
        où a, b - les valeurs souhaitées.

        Exemple pour les nombres 2 5 6:
        quantité  de nombres négatifs: 0
        quantité  de nombres positifs: 3

        Exemple pour les nombres -2-5 6:
        quantité  de nombres négatifs: 2
        quantité  de nombres positifs: 1

        Exigences:
        1. Le programme doit lire les chiffres au clavier.
        2. Le programme doit afficher du texte à l'écran.
        3. Le programme doit afficher la quantité  de nombres négatifs dans le jeu d'origine.
        4. Le programme doit afficher la quantité  de nombres positifs dans le jeu d'origine.
        5. S'il n'y a pas de nombre négatif, le programme doit afficher "la quantité  de nombres négatifs: 0".
        6. S'il n'y a pas de nombres positifs, le programme doit indiquer "la quantité  de nombres positifs: 0".
        7. Tenez compte du fait que le nombre "0" ne fait pas référence à des nombres positifs ou négatifs.

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[3];
        int countPlus = 0;
        int countMinus = 0;

        for (int i=0; i<3; i++){
            list[i] = Integer.parseInt(reader.readLine());
            if(list[i] > 0 && list[i] != 0){
                countPlus++;
            }
            else if(list[i] <0 && list[i] !=0){
                countMinus++;
            }
        }
        System.out.println("quantité  de nombres négatifs:" +countMinus);
        System.out.println("quantité  de nombres positifs:" + countPlus );
    }
}


