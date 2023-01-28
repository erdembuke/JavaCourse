package Gun43;

import java.util.Arrays;

public class _05_TryCatchFinally {

    public static void main(String[] args) {

        long startTime = 0;
        String str = "";

        try {
            startTime = System.currentTimeMillis();
            System.out.println("Hatadan onceki kisim");
            char ilkHarf = str.charAt(0);
            System.out.println("Hatadan sonraki kisim");
            // hata olma olasiliginin oldugu kodlar
        }catch(Exception ex) {
            System.out.println("catch blogu calisti");
            // hata oldugunda yapilacaklar
        }
        finally // hata olsa da olmasa da calisacak kisim, bu bolumun yukaridaki sürecle
                // oldugunu gostermek icin finally icinde yazilir
        {
        long gecenSure = System.currentTimeMillis() - startTime;
            System.out.println("Gecen sure = " + gecenSure);
            System.out.println("try-catch bloguyla ilgili son yapilacaklar");
        }

        System.out.println("diger calisan kodlar");

        System.out.println("program sonu");



    }
}
