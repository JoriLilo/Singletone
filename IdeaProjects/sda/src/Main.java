import java.util.Scanner;

public class Main
{ public static void main(String[] args)
    {
        String greeting;

        Scanner input = new Scanner(System.in);
        System.out.println("te lutem vendods nje pershendtje");
        greeting = input.next();

        String emri;
        System.out.println("vendosni emrin tuaj");
        emri =input.next();
        System.out.println(greeting+"\t"+emri);


    }
}