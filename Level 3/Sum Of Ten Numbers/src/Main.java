
/*
Сумма 10 чисел
        Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
        1
        1+2=3
        1+2+3=6
        1+2+3+4=10
        …
        Пример вывода:
        1
        3
        6
        10
        ...
        Требования:
        1. Программа должна выводить текст.
        2. Выведенный текст должен содержать 10 строк.
        3. Число в каждой новой строке должно быть больше предыдущего.
        4. Выводимый текст должен соответствовать заданию.

        ublic static void main(String[] args) {
         int i = 1;
        int count = 1;
        while (count < 11) {
            System.out.println(i);
            count = count + 1;
            i = i + count;
        }
    }
}

 */

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum = sum+i;
            System.out.println(sum);
        }
    }
}