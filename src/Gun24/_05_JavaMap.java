package Gun24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_JavaMap {
    public static void main(String[] args) {
        // Canli sozluk yapilmak isteniyor
        // Kullaniciya asagidaki gibi bir menu cikarin.

        // 1- ekleme ( bu secenekte kelimenin kendisi ve manasini bir cumle ile yaziniz )
        // 2- Duzeltmen ( bu secenekte kullanicinin kelimenin manasini duzelttirin )
        // 3- Listeleme
        // 4- Arama ( bu secenekte verilen bir kelimeyle baslayan tum kelimelerin manalari )
        // 5- silme
        // 6- cikis
        // TODO : soru yapilacak - yapildi
        // TODO : 2. asama : menulerde yapilacak islemleri metod ile yap
        Map<String, String> tmap = new TreeMap<>();
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        System.out.println("Canli sozluge hosgeldiniz!");
        System.out.println("Seciminize gore program devam edecektir. Menü asagidaki gibidir");
        boolean bittiMi = false;

        do {
            System.out.println("1-Kelime/Anlam Ekleme\n2-Kelime/Anlam Duzeltme\n3-Listeleme\n4-Kelime Arama\n5-Silme\n6-Cikis");
            System.out.print("Secim yapin -> ");
            int secim = scInt.nextInt();

            switch (secim){
                case 1:
                    System.out.print("Kelime Girin -> ");
                    String key = scInt.next();
                    System.out.print("Kelimenin anlamini girin -> ");
                    String value = scStr.nextLine();
                    tmap.put(key, value);
                    break;
                case 2 :
                    System.out.print("Hangi kelimeyi duzeltmek istersiniz -> ");
                    String keyFix = scStr.nextLine();
                    System.out.print("Anlami ne olsun -> ");
                    String valueFix = scStr.nextLine();
                    tmap.put(keyFix, valueFix);
                    break;
                case 3:
                    System.out.print(tmap);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Hangi kelimeyi aramak istersiniz -> ");
                    String arama = scStr.next();
                    System.out.println(arama + " -> " + tmap.get(arama));
                    break;
                case 5:
                    System.out.print("Hangi kelimeyi silmek istersiniz -> ");
                    String silmek = scStr.next();
                    tmap.remove(silmek);
                    System.out.println(silmek + " kelimesi kaldirildi");
                    break;
                case 6:
                    System.out.println("Programi sonlandirdiniz.");
                    bittiMi = true;
                    break;
            }
        }while(!bittiMi);

    }
}
