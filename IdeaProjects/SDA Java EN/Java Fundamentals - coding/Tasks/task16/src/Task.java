import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int f=1;
        if((n==1)||(n==0)){
            System.out.println(1);
        }else {
            for (int i = 1; i<=n; i++) {
                f*=(n-i+1);

            }

            System.out.println(f);
        }
    }
}