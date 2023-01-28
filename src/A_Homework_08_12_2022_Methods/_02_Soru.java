package A_Homework_08_12_2022_Methods;

public class _02_Soru {
    public static void main(String[] args) {
        /*
        "OrtaKelime" isminden bir method olusturun
        Bu method String i parametre olarak almali
        Cumle veya dizelerde ortada bulunan kelimeleri bulmali
        Ortadaki kelimeyi return yapiniz

        Ornek : Ben Java'yi Seviyorum
        print : Java'yi

        Ornek2 : Java'yi kolayca ogreniyorum
        print : kolayca
         */
        OrtaKelime("Ben Java'yi Seviyorum");
        System.out.println("ortadaki kelime \"Ben Java'yi seviyorum\" = " + OrtaKelime("Ben Java'yi seviyorum"));
        System.out.println("ortadaki kelime \"Java'yi kolayca ogreniyorum\" = " + OrtaKelime("Java'yi kolayca ogreniyorum"));

    }
    public static String OrtaKelime(String i) {
        int ilkBosluk = i.indexOf(" ");
        int sonBosluk = i.lastIndexOf(" ");
        String middle = i.substring(ilkBosluk,sonBosluk);
        return middle;
    }
}
