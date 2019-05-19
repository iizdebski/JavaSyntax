/*
0441 Как-то средненько
        Ввести с клавиатуры три числа, вывести на экран среднее из них.
        Т.е. не самое большое и не самое маленькое.
        Если все числа равны, вивести любое из них.

        Требования:
        1. Программа должна считывать числа c клавиатуры.
        2. Программа должна выводить число на экран.
        3. Программа должна выводить среднее из трех чисел.
        4. Если все числа равны, вывести любое из них.
        5. Если два числа из трех равны, вывести любое из двух.

        Как-то средненько
        */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        if((n1 >= n2) & (n1>=n3))
            System.out.println((n3<n2)? n2 : n3);

        else if((n2 >= n1) & (n2>=n3))
            System.out.println((n1<n3)? n1 : n3);

        else if((n3>=n1) & (n3>=n2))
            System.out.println((n1>n2) ? n1:n2);
    }
}
