

public class Main {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));

    }

    private static int getMetreFromCentimetre(int centimetre) {
        int a = centimetre / 100;
        return a;
    }
}


/*
Полнометражная картина
Реализуй метод getMetreFromCentimetre(int centimetre). Метод на вход принимает количество сантиметров.
Нужно сделать так, чтобы метод возвращал число полных метров в centimetre. (1 метр = 100 см).
Пример:
Метод getMetreFromCentimetre вызывается с параметром 243.
Пример вывода:
2
Требования:
1. Метод getMetreFromCentimetre(int) должен быть публичным и статическим.
2. Метод getMetreFromCentimetre должен возвращать значение типа int.
3. Метод getMetreFromCentimetre не должен ничего выводить на экран.
4. Метод getMetreFromCentimetre должен правильно возвращать количество полных метров в centimetre.
 */