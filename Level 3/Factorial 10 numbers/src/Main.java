
/*
Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10.
Результат — это 1 число.
Подсказка:
будет три миллиона с хвостиком.
Требования:
1. Программа должна выводить целое число на экран.
2. Метод main должен вызывать функцию System.out.println.
3. Выведенное число должно быть больше трех миллионов.
4. Выведенное число должно соответствовать заданию.

if (num==0)
return 1;
else
return num*fact(num-1);

someval = (min >= 2) ? 2 : 1;
This is called ternary operator, which can be used as if-else. this is equivalent to
if((min >= 2) {
   someval =2;
} else {
   someval =1
}
 */


public class Main {

    public static void main(String[] args) {
        System.out.println(fact(10));
    }

    private static int fact(int num) {
        return (num==0) ? 1 : num*fact(num-1);
    }
}