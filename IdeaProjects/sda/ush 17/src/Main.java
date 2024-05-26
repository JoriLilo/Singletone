import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("vendos piket e marra");
        int mark = sc.nextInt();
        String msg;
        if(mark>100){
            System.out.println("INCORRECT!!");
        }else if (mark>=50){
            System.out.println("PASS:)");
         }else System.out.println("FAIL:(");


        System.out.println("DONE.");

    }
}