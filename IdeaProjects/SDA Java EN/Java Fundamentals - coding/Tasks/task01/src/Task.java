import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        float speed = scanner.nextFloat();
        speed = speed*1.6f;
        System.out.println(speed);
    }
}