import java.io.*;

/*
0412 Положительное и отрицательное число

Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить число на экран.
3. Если введенное число положительное, необходимо увеличить его в два раза и вывести.
4. Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
5. Если введенное число равно нулю, необходимо вывести ноль.

 */

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numb = reader.readLine();

        int n = Integer.parseInt(numb);
        if(n>0){
             n = n*2;
            System.out.println(n);
        }
        else if(n < 0){
            n = n + 1;
            System.out.println(n);
        }
        else
            System.out.println(0);
    }
}