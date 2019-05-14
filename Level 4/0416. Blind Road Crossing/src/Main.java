import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine()) % 5;

        if( t <= 3){
            System.out.println("green");
        }else if(t <= 4){
            System.out.println("yellow");
        }else{
            System.out.println("red");
        }
    }
}
