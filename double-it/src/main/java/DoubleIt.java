import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleIt {
    public static void main(String[] args) {
        System.out.println("Give me a number, and I will double it for you!");
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String stringNumber = bufferedReader.readLine();
            Integer yourNumber = Integer.parseInt(stringNumber);
            Integer yourDoubledNumber = yourNumber * 2;

            System.out.println("I doubled your number for you: " + yourDoubledNumber);

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}