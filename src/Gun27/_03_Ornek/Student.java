package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String studentName;
    int maxCredit;
    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersEkle(Lesson ders) {
        int toplamSaat = 0;
        for(Lesson d: dersleri)
            toplamSaat += d.lessonCredit;

        if(toplamSaat+ders.lessonCredit <= maxCredit)
            dersleri.add(ders);
        else System.out.println("kredi sınır aşıldı.");
    }

    public void dersleriYazdir() {
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayin" + studentName);
        System.out.println("Aldiginiz dersler asagidadir");
        for (Lesson d : dersleri)
            System.out.println(d.lessonName + " " + d.lessonCredit + " credits");
    }

    public static void universiteKurallari() {
        System.out.println("Kural 1 : Caysiz ve üzümsüz derse gelinmez.");
        System.out.println("Kural 2 : Hocayi can kulagiyla dinle");
    }

}
