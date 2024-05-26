import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String txt = scanner.nextLine();

        if(txt.length()<=3){
            System.out.println(txt.toUpperCase());
        }else {
            char[] array = txt.toCharArray();
            for (int i=array.length-3; i<array.length;i++){
                if((array[i]>= 'a') && (array[i] <= 'z')){
                    array[i] = (char)((int) array[i] -32);
                }
            }

            StringBuilder sb= new StringBuilder();
            for(char el : array){
                sb.append(el);
            }
            System.out.println(sb);
        }

    }
}