package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran = 3.2;
        int sayi = 5;

        sayi=(int)oran; // tehlikeli islem yapiyosun, challenger patlar, degerlere bak eger olusan veri
                   // kaybini anladiysan ve kabulun ise bana bunu yazarak goster (int)oran

        System.out.println("sayi = " + sayi);
        /////////////////////////////////////////////////////
        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre = (byte)(kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        // sen esitligin 2.tarafi rakamlar toplandi,benim toplam burada INT durumunda
        // byte cevre = 5+7+5+7;  // int i -> byte atmaya calisiyosun
        // eger veri kaybi olmayacagindan eminsen, veya veri kaybi onemli degilse (byte) yaz

        System.out.println("cevre = " + cevre);






    }
}
