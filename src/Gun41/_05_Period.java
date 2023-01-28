package Gun41;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        // Period 2 tarih arasındaki farki gosterir , sadece LocalDate ' ler icin kullanılır

        LocalDate dogumTarihi = LocalDate.of(1999, 11, 16);
        LocalDate bugun = LocalDate.now();

        Period fark = Period.between(dogumTarihi, bugun);

        System.out.println("Gunumuzle dogum tarihi arasidaki fark " + fark);
        // 23Y  1M  27D

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("yasiniz = " + fark.getYears());

        System.out.println(fark.getYears() + " Yil , " + fark.getMonths() + " Ay , " +
                fark.getDays() + " Gündür dünya üzerindesiniz :)");

        // -------------------------------- //

        Period period3Gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra = bugun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra = bugun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);

        // ---------------- //

        // Kursun bitis tarihini bulunuz (6 ay) - 31 Ekim 2022

        LocalDate kursBasla = LocalDate.of(2022, 10, 31);
        Period kursSure = Period.ofMonths(6);

        LocalDate kursBitis = kursBasla.plus(kursSure);
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis gun = " + kursBitis.getDayOfWeek());
        System.out.println("kursBitis  ay = " + kursBitis.getMonth());

        Period neKadarSureKaldi = Period.between(bugun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);
        // 3Months  18Days

        Period neKadardirDevam = Period.between(kursBasla,bugun);
        System.out.println("neKadardirDevam = " + neKadardirDevam);
        // 2Months  12Days
    }
}
