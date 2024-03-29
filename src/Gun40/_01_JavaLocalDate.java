package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gun ay yil bilgisini tutar

        LocalDate tarih = LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getChronology() = " + tarih.getChronology());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getEra() = " + tarih.getEra());
        System.out.println();
        System.out.println("ISO_Date = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n****************");
        System.out.println(" FULL Almanya gosterimi = "
                + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));

        // lokalizasyon tanımlaması
        // en-US : birincisi DİLİ , ikincisi ülkeyi temsil ediyor , Amerikan ingilzcesi
        // en-UK :
        // fr-CA :
        // en-CA :
        // tr-TR :

        Locale[] kullanabilirLokaller = Locale.getAvailableLocales();

        for (Locale l : kullanabilirLokaller) {
            if(l.getDisplayCountry().toLowerCase().contains("chi")) {
                System.out.print("Dil = " + l.getDisplayLanguage());
                System.out.print(", Ulke = " + l.getDisplayCountry());
                System.out.print(", " + l.getLanguage());
                System.out.println(" - " + l.getCountry());
            }

        }

        Locale lokalCince = new Locale("zh","CN");
        System.out.println(" FULL Cince gosterimi = "
                + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));


        System.out.println("\n*************Istedigim formatta gosterim************");
        // istedigim formatta gosterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelformat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy = " + tarih.format(ozelformat1));

        DateTimeFormatter oz2 = DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy = " + tarih.format(oz2));

        DateTimeFormatter oz3 = DateTimeFormatter.ofPattern("EEEE dd-MM-yyyy"); // araya "." , "/" , "-" sana kalmıs
        System.out.println("tarih EEEE dd-MM-yyyy = " + tarih.format(oz3));

        System.out.println("özel format ve loc EEEE dd-MM-yyyy = " + tarih.format(oz3.withLocale(Locale.UK)));

        DateTimeFormatter oz4 = DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(oz4));
        
        DateTimeFormatter oz5 = DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(oz5));

        System.out.println("\n***********");
        // kendimiz bir tarihi nasil set edebilir , atayabiliriz ?  int sayi = 5
        
        LocalDate tarih1 = LocalDate.of(2000,5,20);
        LocalDate tarih2 = LocalDate.of(1999, Month.MARCH,12);
        System.out.println("tarih2.format(oz4) = " + tarih2.format(oz4));
        
        
    }
}
