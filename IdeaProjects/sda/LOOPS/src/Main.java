import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("vendos nr1");
        int nr1 = sc.nextInt();
        System.out.println("vendos nr2");
        int nr2 = sc.nextInt();
        System.out.println("vendos nr3");
        int nr3 = sc.nextInt();
        if(nr1==nr2 && nr2==nr3){
            System.out.println("nr jan te barabarte");

        }else if(nr3>nr2 && nr3>nr1) {
            System.out.println("nr me i madh eshte "+nr3);

        }else if(nr2>nr3 && nr2>nr1){
            System.out.println("nr me i madh eshte "+nr2);

        }else
            System.out.println("nr me i madh eshte "+nr1);
    }
}