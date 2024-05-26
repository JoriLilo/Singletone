import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr=scanner.nextInt();
        if (nr<0){
            for (int i=nr; i<=0;i++){
                System.out.print(i + " ");
            }

        }else if (nr>0){
            for (int i=nr; i>=0;i--){
                System.out.print(i + " ");
            }
        }else {
            System.out.println(0);
        }
    }
}