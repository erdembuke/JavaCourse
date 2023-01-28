package Gun32._03_GununSorusu;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    private String okulAd;
    private int kontenjan;

    private static final ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public static void ogrenciOlustur(Okul abc) {
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        System.out.println(abc.okulAd + " kayit sistemine hosgeldiniz ! (Okul kontenjanı " + abc.kontenjan + ")");
        while (ogrenciler.size() < abc.kontenjan) {
            Ogrenci ogrenci1 = new Ogrenci();
            System.out.print("Ogrenci adı girin -> ");
            String isim = scan.nextLine();
            ogrenci1.setAd(isim);
            System.out.print("Ogrenci soyadi girin -> ");
            String soyisim = scan.nextLine();
            ogrenci1.setSoyad(soyisim);
            System.out.print("Ogrenci yaşı girin -> ");
            int yas = scanInt.nextInt();
            if (yas <= 15 && yas >=6) {
                ogrenci1.setYas(yas);
                ogrenci1.setNumber();
                ogrenciler.add(ogrenci1);
                System.out.println(ogrenciler.size() + ". Ogrenci basariyla eklenmistir !");
            } else System.out.println("Gecersiz yaş ! Ögrenci ekleme basarisiz");
        }
        System.out.println("Bütün kontenjanlar dolmuştur !");
        int sira = 1;
        for (Ogrenci abd : ogrenciler) {
            System.out.println(sira + ". Ogrenci = " + abd.getAd() + " "
                    + abd.getSoyad() + " / yas " + abd.getYas() + " / id " + abd.getNumber());
            sira++;
        }
    }

    public Okul() {
    }

    public Okul(String okulAd) {
        this.okulAd = okulAd;
        int kontenjan = this.kontenjan;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }


}
