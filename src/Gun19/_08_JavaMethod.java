package Gun19;

public class _08_JavaMethod {
    public static void main(String[] args) {
        // mainde 20 elemanli diziyi tanimlayin. sonra bir fonksiyona gondererek random 100 e kadar sayilarla doldurun
        // ve ayni fonksiyonda yazdirin
        int[] diziler08 = new int[20];
        Rndwrt(diziler08);

    }

    public static void Rndwrt(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*100);
            System.out.println("Dizinin " + (i) + ". elemani -> " + dizi[i]);
        }
    }
}
