import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount=scanner.nextInt();
        boolean isAble= true;

        if (amount<1) {
            System.out.println(!isAble);
        } else if (amount<= 7) {
            System.out.println(isAble);
        } else if (amount%7==0) {
            System.out.println(isAble);

        } else {
            System.out.println(!isAble);
        }
    }
}