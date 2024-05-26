package ushtrime;

import java.util.List;
import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       Integer time=scanner.nextInt();
        System.out.println(Runner.getFitnessLevel(time));


    }
}
