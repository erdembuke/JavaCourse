package Gun41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _04_JavaLocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime hem tarih hem de saat bilgisi tutar
        
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        System.out.println("ldt.getYear() = " + ldt.getYear());
        System.out.println("ldt.getMonth() = " + ldt.getMonth());
        System.out.println("ldt.getMonthValue() = " + ldt.getMonthValue());
        System.out.println("ldt.getDayOfYear() = " + ldt.getDayOfYear());
        System.out.println("ldt.getDayOfMonth() = " + ldt.getDayOfMonth());
        System.out.println("ldt.getDayOfWeek() = " + ldt.getDayOfWeek());
        System.out.println("ldt.getDayOfWeek().getValue() = " + ldt.getDayOfWeek().getValue());
        System.out.println("ldt.getHour() = " + ldt.getHour());
        System.out.println("ldt.getSecond() = " + ldt.getSecond());
        System.out.println("ldt.getNano() = " + ldt.getNano());

        System.out.println("ISO_DATE_TIME SHORT = " + ldt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("ISO_DATE_TIME MEDIUM = " + ldt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        // LONG FORMAT OLARAK UYMUYOR
        
        // ozel formatta istedigimiz gib yazdirma
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy / hh:mm a");
        System.out.println("ldt.format(f) = " + ldt.format(f));

    }
}
