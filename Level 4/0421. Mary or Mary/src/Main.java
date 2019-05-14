
/*
0421 Настя или Настя

        Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
        Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
        Если имена и длины имен разные — ничего не выводить.

        Требования:
        1. Программа должна считывать строки c клавиатуры.
        2. Программа должна содержать System.out.println() или System.out.print()
        3. Если имена одинаковые вывести сообщение "Имена идентичны"
        4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
        5. Если имена и длины имен разные - ничего не выводить.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if(name1.equals(name2))
            System.out.println("Names are identical");
        else if(name1.length()==name2.length())
            System.out.println("Length of names is equal");
    }
}
