package Gun26.__04_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class musteri {
    String name;
    String aboneNo;

    ElektrikHesabi hesap = new ElektrikHesabi();
    int totaltuketim = hesap.toplamTuketim;
    double birimKwFiyat = hesap.birimFiyat;
    double bill = hesap.fatura;

    public void faturaHesapla() {
        Scanner scInt = new Scanner(System.in);
        ArrayList<Double> faturalar = new ArrayList<>();
        ArrayList<Integer> tuketimler = new ArrayList<>();

        System.out.println(name + " (Abone No. " + aboneNo + ") " + "isimli musterinin kullanim bilgileri" );
        for (int i = 1; i <= 12; i++) {
            System.out.print(i + ". Ay tuketilen Kw -> ");
            int tuketim = scInt.nextInt();
            bill = (tuketim*birimKwFiyat);
            totaltuketim += bill;
            faturalar.add(bill);
            tuketimler.add(tuketim);
        }
        System.out.println("Bu yila ait toplam elektrik faturaniz = " + totaltuketim + " TL");
        System.out.print("Her ayın detayli fiyatlandirmasini gormek istiyor musunuz (e = evet / h = hayir) -> ");
        String cevap = scInt.next();
        if (cevap.equalsIgnoreCase("e")) {
            System.out.println();
            for (int i = 0; i < faturalar.size(); i++) {
                System.out.println((i+1) + ". ay total kw / fiyat bilgileri -> " + tuketimler.get(i) + "kw / " + Math.round(faturalar.get(i)) + " TL");
            }
        }else if (cevap.equalsIgnoreCase("h")) {
            System.out.println("Program sonlandi.");
        }else System.out.println("Yanlis tuslama yaptiniz.");


    }
}
