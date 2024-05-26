import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x= scanner.nextInt();
        int y = scanner.nextInt() ;

        while(y!=0){
            int c=x%y;
            x=y;
            y=c;

        }
        System.out.println(x);
    }
}