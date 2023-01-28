package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int sonuc1 = toplamBul("ismet",s1,s2);
        int sonuc2 = toplamBul("mehmet",s1,s2,s3);
        int sonuc3 = toplamBul("ali",s1,s2,s3,s4);
        // parametreler ayni tip sadece miktarlari farkli
        // bu tip durumlar için bir kolaylik saglanmis.

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);

    }
    // ... ile ilgili 2 kural var
    // 1- bir motedda parametre olarak sadece 1 tane olabilir
    // 2- her zaman son parametre olmali
    // gelen kaç sayi olursa olsun hepsini al dizi seklinde metoda al
    public static int toplamBul(String isim, int... sayilar) {   // kac sayi gelirse gelsin onlari dizi seklinde aliyor
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + sayilar[i];
        }
        return toplam;
    }
}
