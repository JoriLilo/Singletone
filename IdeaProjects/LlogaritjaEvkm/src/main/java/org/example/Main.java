package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("vendos mesataren e 3 viteve te gjimnazit: ");
        double mes3vit= scanner.nextDouble();
        System.out.print("vendos mesataren e provimeve te lirimit: ");
        double mesProvimeve= scanner.nextDouble();

        double vkm=(mes3vit+mesProvimeve)/2;

        System.out.println(vkm);

        System.out.print("Vendos noten perfundimtare te matematikes " +
                "(duke perfshire notat e tre viteve): ");
        double notaMat= scanner.nextDouble();
        System.out.print("Vendos noten perfundimtare te fizikes " +
                "(duke perfshire notat e tre viteve): ");
        double notaFiz= scanner.nextDouble();



        double llog1=vkm*0.7;
        double llogMat=0.6*notaMat;
        double llogFiz=0.4*notaFiz;
        double llog2=0.3*(llogFiz+llogMat);

        double llogaritje=llog2*0.7;

        double llog4=llogaritje*1000;

        double piket=llog1+llog4;

        System.out.println(piket);



    }
}