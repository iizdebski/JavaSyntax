
/*
0417 Существует ли пара
Ввести с клавиатуры три целых числа.
Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Пример для чисел 1 2 2:
2 2

Пример для чисел 2 2 2:
2 2 2

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
 */


import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int ad = Integer.parseInt(a);
        int bd = Integer.parseInt(b);
        int cd = Integer.parseInt(c);
        if(ad == bd && bd == cd)
            System.out.print(ad + " " + bd +" " + cd);
        else if(ad == bd)
            System.out.print(ad + " " + bd);
        else if(bd == cd)
            System.out.print(bd +" " + cd);
        else if(ad == cd)
            System.out.print(ad + " "  + cd);


    }
}