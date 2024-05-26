import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] nr1=new int[2][5];
        for(int i=0; i< 2;i++) {
            for (int j= 0 ; j < 5; j++) {
                nr1[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<5;i++){
            int nr=nr1[0][i];
            for(int j=0;j<5;j++){
                if(nr1[1][j]==nr){
                    System.out.println(nr);
                    break;
                }


            }
        }










    }
}