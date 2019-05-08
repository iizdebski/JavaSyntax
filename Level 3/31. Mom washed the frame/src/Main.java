
/*
Мама мыла раму
        Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».

        Подсказка: их 6 штук.
        Каждую комбинацию вывести с новой строки. Слова не разделять.

        Пример:
        МылаРамуМама
        РамуМамаМыла
        ...


        Требования:
        1. Программа должна выводить текст.
        2. Выведенный текст должен содержать 6 строк.
        3. Текст в каждой строке должен быть уникален.
        4. Должны быть выведены все возможные комбинации.
        Мама мыла раму
*/

public class Main {

    public static void main(String[] args) {
       String[] words = {"Mom", "Washed", "Frame"};
       for (int i=0; i<words.length; i++){
           System.out.println(words[i] + words[(i+1) % words.length] + words[(i+2) % words.length]);
           System.out.println(words[i] + words[(i+2) % words.length] + words[(i+1) % words.length]);
       }
    }
}
