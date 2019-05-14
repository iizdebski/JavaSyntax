
/*
0420 Сортировка трех чисел

Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Выведенные числа должны быть разделены пробелом.
4. Программа должна выводить числа в порядке убывания.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n1 = reader.readLine();
        int a = new Integer(n1);
        String n2 = reader.readLine();
        int b = new Integer(n2);
        String n3 = reader.readLine();
        int c = new Integer(n3);

        int max, mid, min = 0;

        max = Math.max(Math.max(a,b), c);
        min = Math.min(Math.min(a,b), c);
        mid = a + b + c - max - min;

        System.out.println(max + " " + mid + " " + min);
    }
}