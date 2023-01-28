package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // sayilari birbirine cevirdik
        // yazilarin rakamlara cevrilmesi,rakamlarin yaziya cevrilmesi de var

        String ad="technostudy";
        String kelimeSayi="65"; // string haldeyken toplama gibi bir isleme giremez

        int sayiDeger =Integer.parseInt(kelimeSayi);    // sayiya donusturur

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam su an int yani sayi, bunu stringe donusturmek icin ise;
        String strToplam=Integer.toString(toplam); // String e donusturur.
        System.out.println("strToplam = " + strToplam);








    }
}
