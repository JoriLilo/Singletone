package leksioni5;

import java.time.*;

public class Ush {

    public static void main( String [] args) {
        

        Instant instant = Instant.ofEpochSecond(0);
        
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localDateTime); // 2020-04-19T18:33:29.116691800

        LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.of("CET"));
        System.out.println(localTime); // 18:33:29.116691800

        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.ofOffset("UTC", ZoneOffset.ofHours(2)));
        System.out.println(localDate); // 2020-04-19
    }

}
