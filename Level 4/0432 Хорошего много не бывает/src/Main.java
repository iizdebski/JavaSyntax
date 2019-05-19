
/*
0432 Хорошего много не бывает
        Ввести с клавиатуры строку и число N.
        Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

        Пример ввода:
        абв
        2

        Пример вывода:
        абв
        абв

        Требования:
        1. Программа должна считывать текст c клавиатуры.
        2. Программа должна выводить текст на экран.
        3. Каждое значение должно быть выведено с новой строки.
        4. Программа должна выводить на экран строку N раз.
        5. В программе должен использоваться цикл while.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int n = Integer.parseInt(reader.readLine());

        int i=0;
        while(i<n){
            System.out.println(s);
            i++;
        }
    }
}