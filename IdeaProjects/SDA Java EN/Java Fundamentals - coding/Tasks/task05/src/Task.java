import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nr=scanner.nextFloat();
        System.out.println(Math.floor(nr));
        System.out.println(Math.round(nr));
        System.out.println(Math.ceil(nr));
    }
}