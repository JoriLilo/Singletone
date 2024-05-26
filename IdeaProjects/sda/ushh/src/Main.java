import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("vendos a  ");
        int a=input.nextInt();
        System.out.println("vendos b");
        int b=input.nextInt();
        boolean result=a<50||a<b;

        System.out.println(result);
    }
}