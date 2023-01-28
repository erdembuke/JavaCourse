package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad = "TechnoStudy";  // String : Kelime veya Kelimeleri saklamak icin kullanilir
        // sinirlar " " ile belirlenir

        String soyad = "Batch 3";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad); // alt alta yazdiricak

        System.out.println("ad ve soyad = " + ad + " " + soyad); // ad ve soyadi yanyana yazar
        System.out.println("ad ve soyad = " + ad + "\t" + soyad); // ad ve soyadi yanyana yazar
        // + lar burada stringleri birlestirir

        String tamAd="TechnoStudy" + " " + "Batch 3";
        System.out.println("tamAd = " + tamAd);



    }
}
