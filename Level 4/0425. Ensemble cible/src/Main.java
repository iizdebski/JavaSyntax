/*
Entrez deux nombres entiers du clavier, qui seront les coordonnées d’un point ne se trouvant pas sur les axes de coordonnées OX et OY.
        Affiche le numéro du quart de coordonnées dans lequel se trouve le point.
        Indice:
        L'appartenance d'un point de coordonnées (a, b) à l'un des quarts est déterminée comme suit:
        pour le premier trimestre a> 0 et b> 0;
        pour le deuxième trimestre a <0 et b> 0;
        pour le troisième trimestre a <0 et b <0;
        pour le quatrième trimestre, a> 0 et b <0.

        Exemple pour les nombres 4 à 6:
        1

        Exemple pour les nombres -6 -6:
        3


        Exigences:
        1. Le programme doit lire les chiffres au clavier.
        2. Le programme doit utiliser la commande System.out.println () ou System.out.print ().
        3. Si le point est dans le premier quart de coordonnées, indiquez "1".
        4. Si le point est dans le deuxième quart des coordonnées, indiquez "2".
        5. Si le point est dans le troisième quart des coordonnées, indiquez "3".
        6. Si le point est dans le quatrième quart de coordonnées, indiquez "4".

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader.readLine());
                int b = Integer.parseInt(reader.readLine());
                if (a > 0 && b > 0) System.out.println(1);
                if (a < 0 && b > 0) System.out.println(2);
                if (a < 0 && b < 0) System.out.println(3);
                if (a > 0 && b < 0) System.out.println(4);
            }
        }