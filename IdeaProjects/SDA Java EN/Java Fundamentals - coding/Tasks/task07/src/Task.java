import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x= scanner.nextInt();
        int y= scanner.nextInt();
        if((x>y)||(x<0)|| (y>10000)){
            return;
        }


        for(int i=x; i<=y; i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
}