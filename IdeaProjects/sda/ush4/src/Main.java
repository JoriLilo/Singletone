import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("vendos nje nr1");
        int nr1 = sc.nextInt();
        System.out.println("vendos nje nr2");
        int nr2 = sc.nextInt();
        System.out.println("vendos nje nr3");
        int nr3 = sc.nextInt();

        if (nr1==nr2 && nr2==nr3){
            System.out.println("nr te =");
        }else if(nr1>nr2 && nr2>nr3){
            System.out.println("decreasing");
        }else if(nr1<nr2 && nr2<nr3) {
            System.out.println("increasing");
        }else System.out.println("nuk kane rend");
    }
}