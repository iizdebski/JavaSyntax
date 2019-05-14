

public class Solution {
    public static void main(String[] args) {
        checkSeason(10);
        checkSeason(7);
        checkSeason(4);
        checkSeason(12);
    }

    public static void checkSeason(int month) {
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("лето");
        } else {
            System.out.println("осень");
        }
    }
}

