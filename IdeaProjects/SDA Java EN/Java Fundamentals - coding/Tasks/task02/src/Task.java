import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr1=scanner.nextInt();
        if(nr1-100<=10){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}