public class Main {

    public static void main(String[] args) {
        checkInterval(70);
    }

    private static void checkInterval(int a) {
        if(a <= 60)
            System.out.println("Number " + a + " is available in the Interval");
        else
            System.out.println("Number " + a + " is not available in the Interval");
    }
}