package Gun19;

public class _05_JavaMethod {

    // buraya metodlar yazilabilir

    public static void main(String[] args) { // ana metod,diger metodlari burdan cagiracagiz
        Math.max(5,6); // bi seyler verilmis, geriye deger alınıyor.
        Math.random(); // veri almiyor , veriyor
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // kullanimi kolay cagirmasi kolay tekrar tekrar kullanabilirsin
        merhabaYaz(); // mainin daha kolay anlasilabilir olur
        merhabaYaz(); // fonksiyonu cagirma sekli
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazip sonra tekrar cagirmak icin
    // ve büyük programi parcalara bölüp kod karisikliginin onune gecmek icin kullanilir
    // temiz kod icin

    // buraya metodlar yazilabilir

}
