package codingExamples;

import java.util.Scanner;

public class task5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            float sum1 =1/i;
             sum=sum1;
        }
        System.out.println((float) sum);



    }
}
