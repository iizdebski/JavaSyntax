
/*
0443 Как назвали, так назвали
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
«Меня зовут name.
Я родился d.m.y»

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988


Требования:
1. Программа должна считывать строки c клавиатуры.
2. Программа должна выводить строки на экран.
3. Программа должна выводить текст, шаблон которого указан в задании.
4. Каждое предложение вывести с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        int y = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        System.out.println("My name is " + name +".");
        System.out.println("I was born " + d + "." +m+ "." + y);


    }
}