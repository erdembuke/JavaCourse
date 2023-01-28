package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    
    // Baska zaman bolgelerin (Time Zone) zaman bilgisini almak.

    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        // su anda icinde bulunan time zone
        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();

        for (String z : zamanBolgeleri) {
            if (z.toLowerCase().contains("new"))
                System.out.println("z = " + z);
        }

        ZoneId zoneIdIstanbul = ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul = ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);

        ZoneId zoneIdLondon = ZoneId.of("Europe/London");
        ZonedDateTime zoneLondon = ZonedDateTime.now(zoneIdLondon);
        System.out.println("saatLondon = " + zoneLondon);

        ZoneId zoneIdNewYork = ZoneId.of("America/New_York");
        ZonedDateTime zoneNewYork = ZonedDateTime.now(zoneIdNewYork);
        System.out.println("zoneNewYork = " + zoneNewYork);

    }
    
}
