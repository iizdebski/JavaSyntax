
/*
Обмен валют
Реализуй метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
Требования:
1. Метод convertEurToUsd должен умножать евро на курс и возвращать полученный результат.
2. Метод main должен 2 раза вызвать метод convertEurToUsd с любыми параметрами.
3. Метод main должен выводить результаты вызовов на экран, каждый раз с новой строки.
4. Метод convertEurToUsd не должен ничего выводить на экран.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(convertEurToUsd(60, 0.80));
        System.out.println(convertEurToUsd(65, 0.70));
    }

    private static double convertEurToUsd(int eur, double course) {
        double usd = eur * course;
        return usd;
    }
}
