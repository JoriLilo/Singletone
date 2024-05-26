import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String text = scanner.nextLine();
         String bleeptxt= "[bleep]";

         text=text
                 .replaceAll("cheese and rice", bleeptxt)
                 .replaceAll("chuck it", bleeptxt)
                 .replaceAll("motherpuffin", bleeptxt);
        System.out.println(text);




    }
}