import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String txt = scanner.next();
        LocalDate date = LocalDate.parse(txt, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        while (!date.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
            date=date.plusDays(1);
        }
        System.out.println(date);

    }
}