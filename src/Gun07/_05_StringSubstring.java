package Gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {
        // stringin belli bir bolumunu alma islemini yapar.

        //           0123456789
        String s1 = "Merhaba arkadaşlar";

        String parca1 = s1.substring(3,7); // 3 no lu index den 7 no lu indexe kadar, ama 7 dahil degil
        System.out.println("parca1 = " + parca1);

        String parca2 = s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        String parca3 = s1.substring(8); // verilenden baslayip sonuna kadar alir
        System.out.println("parca3 = " + parca3);








    }
}
