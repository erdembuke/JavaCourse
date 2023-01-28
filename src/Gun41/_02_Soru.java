package Gun41;

import MyUtilities.DenemeClassi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    // canlı digital saat yapınız

    public static void main(String[] args) {

        while(true) {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("kk:mm:ss");
            LocalTime saat = LocalTime.now();
            System.out.print("\r" + saat.format(format));
            DenemeClassi.waitForIt(1);
        }


/*
        for (int i = 0; i < 100 ; i++) {
            LocalTime dijitalSaat = LocalTime.now();
            DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("k:mm:s");
            System.out.println("dijitalSaat = " + dijitalSaat.format(dt1));
            DenemeClassi.waitForIt(1);
        }
    }

 */
    }
}
