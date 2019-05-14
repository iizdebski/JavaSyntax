
/*
Пример для номера 10:
такого дня недели не существует

Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rad = Integer.parseInt(reader.readLine());
        if(rad ==1)
           System.out.println("Monday");
        else if (rad ==2)
            System.out.println("Tuesday");
        else if(rad == 3)
            System.out.println("Wednesday");
        else if(rad==4)
            System.out.println("Thursday");
        else if(rad==5)
            System.out.println("Friday");
        else if(rad==6)
            System.out.println("Saturday");
        else if(rad==7)
            System.out.println("Sunday");
        else
            System.out.println("Such day of the week does not exist");
    }
}