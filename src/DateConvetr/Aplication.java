package DateConvetr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Aplication {
     public static void main(String[] args) {
         Date date = new Date();
         DateConverter dateConverter = new DateConverter();
         LocalDate localDate = dateConverter.convertToLocalDate(date);
         LocalTime localTime = dateConverter.convertToLocalTime(date);
         LocalDateTime localDateTime = dateConverter.convertToLocalDateTime(date);
         System.out.println("LocalDate: " + localDate + "\n"
                 + "LocalTime: " + localTime + "\n"
                 + "LocalDateTime: " + localDateTime);
    }
}
