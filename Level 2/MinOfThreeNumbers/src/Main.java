
/*
Минимум трёх чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
Подсказка:
Нужно написать тело существующей функции min.
Требования:
1. Программа должна выводить текст на экран.
2. Метод min не должен выводить текст на экран.
3. Метод main должен вызвать метод min четыре раза.
4. Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
5. Метод min должен возвращать минимальное значение из чисел a, b и с.
 */

public class Main {
    public static int min(int a, int b, int c) {
        if (a<=b && a<=c)
            return a;
        else
        if (b<=a&&b<=c)
            return b;
        else
        if (c<=a&&c<=b)
            return c;
        else
            return a;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(10, 5, 10));
    }
}