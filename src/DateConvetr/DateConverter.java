import java.time.*;
import java.util.Date;

public class DateConverter {

    public LocalDate convertToLocalDate(Date date) {
        Instant instant = date.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public  LocalTime convertToLocalTime(Date date) {
        Instant instant = date.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public  LocalDateTime convertToLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    private Instant toInstant() {
        return null;
    }
}
