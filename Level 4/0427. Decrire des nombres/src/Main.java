import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String a1 = r.readLine();
        int a = Integer.parseInt(a1);
        String ch = " pair";
        String nec = "impair";
        String s1 = " unique";
        String s2 = " bivalent";
        String s3 = " trois chiffres";
        String chis = " numero";

        if(a >= 1 && a <= 999) {
            if (a % 2 == 0) {
                System.out.print(ch);

            } else System.out.print(nec);

            if (a1.length() == 1) {
                System.out.print(s1 + chis);
            }

            if (a1.length() == 2) {
                System.out.print(s2 + chis);
            }

            if (a1.length() == 3) {
                System.out.print(s3 + chis);
            }
        }
    }
}
