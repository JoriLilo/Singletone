import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        String b="*";
        char c=' ';

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(b);
            }

            System.out.println(c);
        }
    }
}