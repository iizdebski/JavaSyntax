import java.util.Scanner;

/*
квадрат числа
        Напиши программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
        Для считывания данных с клавиатуры используй метод nextInt() класса Scanner.

        Требования:
        1. Программа должна выводить текст.
        2. В программе необходимо создать объект типа Scanner.
        3. Программа должна считывать данные с клавиатуры.
        4. Программа должна выводить квадрат считанного числа.
 */


public class Main {

    public static void main(String[] args) {

        Scanner quadro = new Scanner(System.in);
        int a = quadro.nextInt();
        System.out.println(a*a);
    }
}