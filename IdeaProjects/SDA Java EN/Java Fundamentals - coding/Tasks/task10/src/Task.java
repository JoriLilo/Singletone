import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.toLowerCase();
        String[] stringArr = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<stringArr.length;i++){
            sb.append(stringArr[i]);
        }

        text = sb.toString();

        char[] textArr = new char[text.length()];

        for (int i=0;i<text.length();i++) {
            if (text.charAt(i) != ' '){
                textArr[i] = text.charAt(i);
            }
        }

        boolean isPalinrome = false;

        for (int i=0;i< textArr.length;i++) {
            if(textArr[i] == textArr[textArr.length-1-i]) {
                isPalinrome = true;
            }else {
                isPalinrome = false;
                break;
            }
        }

        System.out.println(isPalinrome);

    }
}