
/*
0414 Количство дней в году

Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
«количество дней в году: x», где
х — 366 для високосного года,
х — 365 для обычного года.

Подсказка:
В високосном году — 366 дней, тогда как в обычном — 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — не високосные.


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введенный год является високосным, необходимо вывести текст: "количество дней в году: 366"
4. Если введенный год не является високосным, необходимо вывести текст: "количество дней в году: 365"
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int x1 = 366, x2 = 365;
        if(a % 4 == 0)
            if(a % 100 == 0 && a % 400 != 0)
                System.out.println("Quantity of days in the year: " + x2);
            else
                System.out.println("Quantity of days in the year: " + x1);
            else
            System.out.println("Quantity of days in the year " + x2);

    }
}
