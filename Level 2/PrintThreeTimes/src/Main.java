
/*
Печатаем трижды
Реализуй метод print3. Метод должен вывести переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать функцию System.out.println или System.out.print.
3. Метод print3 должен выводить текст на экран.
4. Метод main должен вызвать метод print3 только два раза.
5. Метод print3 должен выводить переданную строку (слово) на экран три раза, но в одной строке.

public class Main {
    public static void print3(String s) {
        for(int i = 1; i < 4; i++)
            System.out.print(s + " ");
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
someval = (min >= 2) ? 2 : 1;
This is called ternary operator, which can be used as if-else. this is equivalent to
if((min >= 2) {
   someval =2;
} else {
   someval =1
}
 */

public class Main{
    public static void print3(String s){
        for(int i = 0; i < 3; i++){
            String tmp = i < 2 ? s + " ": s;
            System.out.print(tmp);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}