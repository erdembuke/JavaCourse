package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Math.random() - > double sayi uretir. (her seye cevirebildigi icin) 0-0,99999999 arasi üretiyor


        double randSayi = Math.random();
        System.out.println("randSayi = " + randSayi);

        // 0-6 arasi üretsin
        // 6 ile carparim
        // 0 - 0,999999999
        // int cevirirsem 0-5 arasi verir

        int rndTamSayi = (int)(Math.random() * 6);  // 0 - 6 arasi uretir 6 dahil degil

        System.out.println("rndTamSayi = " + rndTamSayi);
    }
}
