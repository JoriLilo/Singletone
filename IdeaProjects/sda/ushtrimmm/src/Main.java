import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("vendosni moshen tuaj");
        int mosha=sc.nextInt();
        String message =(mosha>17)?"ADULT":"MINOREN";
        System.out.println(message);


        //if(mosha>=18){
            //System.out.println("personi esht adult");
        //}else
            //System.out.println("personi eshte minoren");

    }
}