public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Zerg zerg = new Zerg();
            zerg.name = "z"+i;

        }
        for (int i = 0; i < 5; i++) {
            Protoss protoss = new Protoss();
            protoss.name = "p"+i;
        }
        for (int i = 0; i < 12; i++) {
            Terran terran = new Terran();
            terran.name = "t"+i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}


/*
Привет Starcraft

Создать 10 зергов, 5 протоссов и 12 терран.
Дать им всем уникальные имена.

Требования:
1. Нужно создать 10 объектов типа Zerg и каждому из них дать свое имя.
2. Нужно создать 5 объектов типа Protoss и каждому из них дать свое имя.
3. Нужно создать 12 объектов типа Terran и каждому из них дать свое имя.
4. Нельзя изменять классы Zerg, Protoss и Terran.

 */