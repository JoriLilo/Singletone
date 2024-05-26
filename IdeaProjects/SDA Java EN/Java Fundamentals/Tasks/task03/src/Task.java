import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double income=scanner.nextDouble();
        double tax;
        if (income<=85528D) {
            tax=((18*income)/100)-556.02D;

            if (tax<=0){
                tax=0;

            }
            System.out.println(tax);

        } else if (income>=85528D) {
            double surplus=income-85528D;
            tax=((32*surplus)/100)+14839.02D;

            if (tax<=0){
                tax=0;

            }
            System.out.println(tax);
        }


    }
}