
/*
0415 Правило треугольника
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
«Треугольник существует.» — если треугольник с такими сторонами существует.
«Треугольник не существует.» — если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если треугольник с такими сторонами может существовать, необходимо вывести текст: "Треугольник существует."
4. Если треугольник с такими сторонами не может существовать, необходимо вывести текст: "Треугольник не существует."
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int ad = Integer.parseInt(a);
        int bd = Integer.parseInt(b);
        int cd = Integer.parseInt(c);
        if(ad+bd>cd && ad+cd>bd && cd+bd>ad)
            System.out.println("Triangle exists");
        else
            System.out.println("Triangle does not exist");
    }
}
