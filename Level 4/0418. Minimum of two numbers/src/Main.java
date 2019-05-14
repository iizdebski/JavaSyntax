
/*
0418 Минимум двух чисел

        Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
        Если два числа равны между собой, необходимо вывести любое.
        Требования:
        1. Программа должна считывать числа c клавиатуры.
        2. Программа должна выводить число на экран.
        3. Программа должна выводить на экран минимальное из двух чисел.
        4. Если два числа равны между собой, необходимо вывести любое.

        Минимум двух чисел


import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bfr.readLine());
        int b = Integer.parseInt(bfr.readLine());
        if (a > b) System.out.println(b);
        else System.out.println(a);
    }
}
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(a < b ? a : b);
    }
}