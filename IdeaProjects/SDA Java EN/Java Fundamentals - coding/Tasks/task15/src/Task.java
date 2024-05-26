import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int remainder;


        if(a>b){

                for (int i = 0; i <= b; i++) {
                    remainder = a - (i * b);
                    if (remainder>=b){
                      continue;
                    }
                    System.out.println(remainder);
                    break;
                }



        }else {
                for (int i = 0; i <= a; i++) {
                    remainder = b - (i * a);

                    if (remainder>=a){
                        continue;

                    }
                    System.out.println(remainder);
                    break;
                }


        }







    }
}