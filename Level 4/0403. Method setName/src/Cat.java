

/*
чтобы с его помощью можно было устанавливать значение переменной
private String fullName
равное значению локальной переменной String fullName.

Требования:
1. Класс Cat должен содержать только одну переменную fullName.
2. Переменная fullName должна иметь модификатор доступа private и тип String.
3. Класс Cat должен содержать только два метода setName и main.
4. Метод setName должен иметь локальную переменную fullName.
5. Метод setName класса Cat должен устанавливать значение глобальной переменной
private String fullName равным локальной переменной fullName.
 */

public class Cat {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Vasya");
        System.out.println(cat.name);
    }
}