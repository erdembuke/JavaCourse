package Gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        // Soru1: İki kenarı tanımlı olarak verilen bir dikdortgenin çevresini ve alanını bulunuz
        //  çarpma :   * kullanılıyor ,   x ise harf olarak kullanılıyor
        //  bir kenarı a ise , diğer kenarı b ise, cevre=a+a+b+b, alan =a*b

        int kisaKenar = 7;
        int uzunKenar = 15;

        int cevre;
        cevre = kisaKenar + kisaKenar + uzunKenar + uzunKenar;

        int alan;
        alan = kisaKenar * uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
