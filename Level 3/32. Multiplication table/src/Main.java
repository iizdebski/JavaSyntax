
public class Main {

    public static void main(String[] args) {

        for (int i= 1; i<=10; i++){
            for (int j = 1; j<= 11; j++){
                if (j-1 == 10)
                    System.out.println("");
                else
                    System.out.println(i * j + " ");
            }
        }
    }
}


/*
Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
Требования:
1. Программа должна выводить текст.
2. Выведенный текст должен содержать 10 строк.
3. Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
4. Выведенные числа должны быть таблицей умножения.
 */