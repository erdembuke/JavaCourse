package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // kullanicidan alinan ve String durumundaki time veya tarih bilgisinin
        // time veya tarih bilgisine çevrilmesi

        long startTime = System.currentTimeMillis(); // kodun performansı

        Scanner oku = new Scanner(System.in);
        System.out.print("Tarih girin (25 01 2023) gibi -> ");
        String strTarih = oku.nextLine();

        // Kullanicinin girecegi formata gore format olusturduk.
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyyy");

        // Stringin formati bu formate uygun olmali. parse ile çevirdik
        LocalDate tarih = LocalDate.parse(strTarih,format);
        System.out.println("tarih = " + tarih.format(format));

        long finishTime = System.currentTimeMillis();
        System.out.println("gecenSure = " + (finishTime-startTime) + " ms");
    }
}
