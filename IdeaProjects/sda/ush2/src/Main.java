import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("vendos nje nr 3 shifror");
        int nr = sc.nextInt();

        int nr2;
       int  sh1=nr/100;
        int sh2=((nr/10)%10)*10;
        int sh3=(nr%10)*100;
        nr2=sh1+sh2+sh3;
        System.out.println(nr2);
    }
}