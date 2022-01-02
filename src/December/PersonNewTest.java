package December;

import java.text.ParseException;
import java.time.*;

public class PersonNewTest {
    public static void main(String[] args) throws ParseException {
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        Instant minus = instant.minus(Duration.ofHours(1));
        System.out.println(minus);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
