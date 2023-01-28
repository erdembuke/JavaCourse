package Gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // ogretmen icin not defteri programi yapilma isteniyor
        // her ogrencinin okulNo(int), tamAdi(String) ve notu(int) vardir
        // ogretmenden 20 ogrenci icin bu bilgileri alin
        // butun ogrencileri bir metodda yazdirin
        // sinifin not ortalamasini yine bir metodda yazdirin
        // gerekli Class(lar) icin ayri dosya acin
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        ArrayList<Student> studentInf = new ArrayList<>();

        for (int i = 0; i < 2; i++) {   // kolaylik olsun diye 2 yaptik , normalde 20
            Student ogrenci = new Student();
            System.out.print("Ogrenci Numarasi girin -> "); ogrenci.okulNo = scInt.nextInt();
            System.out.print("Ogrenci'nin tam adini girin -> "); ogrenci.tamAd = scStr.nextLine();
            System.out.print("Ogrenci Notunu girin -> "); ogrenci.notu = scInt.nextInt();
            studentInf.add(ogrenci);
            System.out.println("ekleme basarili !");
        }
        writeNames(studentInf);
        writeNumber(studentInf);
        writeGradeAvg(studentInf);

    }

    public static void writeNames(ArrayList<Student> list) {
        int sira = 1;
        for (Student std : list) {
            System.out.println(sira + ". Ogrenci ismi = " + std.tamAd);
        }
    }

    public static void writeGradeAvg(ArrayList<Student> list2) {
        int toplam = 0;
        int sayi = 0;
        for (Student grade : list2) {
        toplam = toplam + grade.notu;
        sayi++;
        }
        int ort = (toplam / sayi);
        System.out.println("Notlarinin ortalamasi = " + ort);
    }
    public static void writeNumber(ArrayList<Student> list3) {
        int sira3 = 1;
        for (Student stdNo : list3) {
            System.out.println(sira3 + ". ogrencinin no = " + stdNo.okulNo);
        }
    }
}
