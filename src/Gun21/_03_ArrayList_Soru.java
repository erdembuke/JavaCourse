package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir ogretmenden girmek istedigi kadar notu aliniz
        // ögretmene devam etmek istiyor musunuz (E/H) seklinde sorunuz
        // ve ortalamayi gecen ogrenci sayisini bulunuz.

        boolean bittiMi = false;
        int toplam = 0;
        int index = 0;
        ArrayList<Integer> notlar = new ArrayList<>();
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        do {
            System.out.print("Not girin -> ");
            notlar.add(index,scInt.nextInt());
            toplam += notlar.get(index);
            index++;
            System.out.print("Devam Etmek istiyor musunuz (E = evet / H = hayır) ? ");
            String cevap = scStr.next();
            if (cevap.equalsIgnoreCase("e")) {
                bittiMi = false;
            }else if (cevap.equalsIgnoreCase("h")) {
                bittiMi = true;
            }else {
                System.out.println("geçersiz giriş yaptınız tekrar deneyin.");
                break;
            }


        }while(!bittiMi);

        int ort = (toplam / notlar.size());
        System.out.println("Notlarin ortalamasi = " + ort);

        int gecenler = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) >= ort) {
                gecenler++;
            }

        }
        System.out.println("Gecenlerin sayisi -> " + gecenler);

    }
}
