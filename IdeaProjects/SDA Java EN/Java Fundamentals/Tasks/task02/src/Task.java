import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        float tempInCelcius=scanner.nextFloat();

        float tempInF= (1.8F * tempInCelcius)+32.0F;
        System.out.println(tempInF);

    }
}