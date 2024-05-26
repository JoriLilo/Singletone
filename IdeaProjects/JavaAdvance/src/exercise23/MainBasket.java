package exercise23;

import java.util.Scanner;

public class MainBasket{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int item= scanner.nextInt();
        try{
            item=10;

        }catch(Exception e){
            System.out.println("basket is full");
            System.out.println(e.getLocalizedMessage());
        }
        try {
            item=0;
        }catch(Exception e){
            System.out.println("basket is empty");
            System.out.println(e.getLocalizedMessage());
        }
    }



}
