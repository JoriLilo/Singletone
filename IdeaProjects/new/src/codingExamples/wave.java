package codingExamples;

import java.util.Scanner;

public class wave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        drawWave(length);
    }

    public static void drawWave(int length) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= length; j++) {
                if ((j % 4 == i % 4) || ((j + i) % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
