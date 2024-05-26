package codingExamples;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("put your height");
        float height= sc.nextFloat();
        System.out.print("put your weight");
        float weight=sc.nextInt();

        float bmi= weight/(height*height);

        if((bmi>=18.5)&&(bmi<=24.9)){
            System.out.println(" optimal "+bmi);
        }else{
            System.out.println("not optimal "+ bmi);
        }
    }
}
