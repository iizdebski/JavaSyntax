import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
0442 Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна посчитать сумму введенных чисел. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
4. В программе должен использоваться цикл for или цикл while.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int sum = 0;

        while(a!=-1){
            a = Integer.parseInt(reader.readLine());
            sum+=a;
        }
        System.out.println(sum);
    }
}