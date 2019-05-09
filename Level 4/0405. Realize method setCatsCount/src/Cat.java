
/*
0405 Реализовать метод setCatsCount

Реализовать метод setCatsCount Реализовать метод setCatsCount так,
чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
Требования: 1.Класс Cat должен содержать только одну переменную catsCount.
2.Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
3.Класс Cat должен содержать два метода setCatsCount и main.
4.Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount равным переданному параметру.

Вся лекция в двух словах, ребят:
1. Если переменная помечена словом "static", то она общая для всех объектов, что будут созданы.
(Что-то вроде общей ячейки в банке, из которой все могут брать что-то, и все могут туда ложить что-то).
2. THIS используйте, когда имена вашей переменной в классе и переменной в методе совпадают.
Не заморачивайтесь, просто помните - вызов переменной в методе - ее имя.
Вызов переменной в классе - this. + ее имя. Ничего сложного, пацаны :D.
3. Если видишь что в метод объявлен СТАТИЧЕСКИМ, то про this ЗАБУДЬТЕ сразу!!

1 Когда переменная или класс статитический, то он вызывается ClassName.methodName().
(Типа у вас есть класс Cat, а внутри - метод catCount().
Так вот чтоб его вызвать, юзайте Cat.catCount() . )
4. Короче: Нестатический метод - забей и юзай This.
Если статический, то вместо this пишешь название его класса. Все.
Пока что это все, что вам нужно знать.
Если есть вопросы - пишите в ЛС.
Удачи, пацаны!

 */

public class Cat {

    private static int catsCount = 0;

    public static void setCatsCount(int catsCount){
        Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {

    }
}