package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        // hem LocalTime hem de LocalDateTime arasindaki farkı verir

        // LocalTime
        LocalTime dersBaslangic = LocalTime.of(19, 0, 0);
        LocalTime dersBitis = LocalTime.of(22, 0, 0);

        Duration gunlukDersSuresi = Duration.between(dersBaslangic, dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("gunlukDersSuresi toHours() = " + gunlukDersSuresi.toHours());   // farkin toplam saati
        System.out.println("gunlukDersSuresi toMinutes() = " + gunlukDersSuresi.toMinutes());   // farkin toplam dk


        // LocalDateTime *** 2 Tarih-Saat arasindaki fark ***

        LocalDateTime from = LocalDateTime.now();
        LocalDateTime bitis = LocalDateTime.of(2023,5,1,19,0);

        Duration neKadarKaldi = Duration.between(from,bitis);
        System.out.println("neKadarKaldi = " + neKadarKaldi);
        System.out.println("neKadarKaldi toDays() = " + neKadarKaldi.toDays());


    }
}
