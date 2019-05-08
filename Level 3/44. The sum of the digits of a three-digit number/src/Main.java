public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    private static int sumDigitsInNumber(int number) {
        int a = number % 10;
        int b = (number / 10) %10;
        int c = number / 100;

        number = a + b + c;

        return number;
    }
}



/*
Сумма цифр трехзначного числа
Реализуй метод sumDigitsInNumber(int number).
Метод на вход принимает целое трехзначное число.
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15

Требования:
1. Метод sumDigitsInNumber(int) должен быть публичным и статическим.
2. Метод sumDigitsInNumber должен возвращать значение типа int.
3. Метод sumDigitsInNumber не должен ничего выводить на экран.
4. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
 */