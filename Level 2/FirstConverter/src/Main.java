/*
Level 2 Lection 2
Наш первый конвертер!
Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия. Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9
Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 40.
Пример вывода:
104.0
Требования:
1. Метод convertCelsiumToFahrenheit(int) должен быть публичным и статическим.  //  public static double convertCelsiumToFahrenheit(int celsium) {
2. Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
3. Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
4. Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия в градусы Фаренгейта и возвращать это число. //   double fahrenheit = 1.8 * celsium + 32.0;

public class Solution {
public static void main(String[] args) {
System.out.println(convertCelsiumToFahrenheit(41));
}
public static double convertCelsiumToFahrenheit(int celsium) {
return (celsium*9D)/5+32;
}
}
для того чтобы компилятор автоматически приводил значение к нужному типу,
достаточно указать тип большой латинкой буквой
celsium*9D  результат будет Double
если же поставть celsium*9L то результат будет Long

Наш первый конвертер!
*/


public class Main {

    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }
    public static double convertCelsiumToFahrenheit(int celsium){
        double fahrenheit = 1.8 * celsium + 32.0;
        return fahrenheit;
    }
}