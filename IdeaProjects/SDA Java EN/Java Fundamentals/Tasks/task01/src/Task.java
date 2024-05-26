import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int height= sc.nextInt();
        float weight= sc.nextFloat();

        if(height<=150||weight>180) {
                System.out.println("I'm sorry you can't go!");


        }else {
            System.out.println("Fasten your seatbelt!");
        }
    }
}