import java.util.Scanner;

public class Task {

   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String txt=sc.nextLine();
    System.out.println(txt.replaceAll("^http://","https://"));



}
}