
/*
Немедленно в печать
        Добавь метод public static void printString(String s), который будет выводить переданную строку на экран.

        Требования:
        1. Добавь метод printString, у которого аргумент имеет тип String.
        2. Метод printString должен быть void.
        3. Метод printString должен быть static.
        4. Метод printString должен быть public.
        5. Метод printString должен выводить переданный текст на экран.
        6. Программа должна вывести «Hello Amigo!».
 */

public class Main {

    public static void main(String[] args) {
        printString("Zumwalt Destroyer");
    }

    private static void printString(String s) {
        System.out.println(s);
    }
}
