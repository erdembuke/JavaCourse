package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

        int[] dizi = new int[51]; // 1. sayi 2. sayi diye baslayip 50. sayi diye yazdiracagim icin gercekcilik adina 51 dedim
                                  // ve sayaci da 1 den baslattim 0 yerine normalde i yi 0 dan baslatip int degeri 50 verilebilir
                                  // ayni sey.

        for (int i = 1; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*11);
        }

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                dizi[i] = 0;
                System.out.println(i + ". -> " + dizi[i]);
            }
                else {
                dizi[i] = 1;
                System.out.println(i + ". -> " + dizi[i]);
            }
                
        }

    }
}
