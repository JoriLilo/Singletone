package leksioni5;

import java.util.Scanner;

public class Ush9Dtsh {
    public static void main (String[] args){
        int maxNr=0;
        int minNr=0;
        int value;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("vendos nje nr");
             value= sc.nextInt();
            if(value<0){
                if (value>maxNr){
                    maxNr=value;
                }
                if(value<minNr){
                    minNr=value;
                }

            }

        }while (value>0);
        System.out.println();



    }
}
