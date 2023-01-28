package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz(); // Math.random();
        merhabaYazIsme("ismet"); // Math.abs(-10)

        CokMerhabaYaz(5);

    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
    }

    public static void merhabaYazIsme(String isim) {  // karsılayan sey parantezin ici
        System.out.println(isim + " e merhaba");
    }

    public static void CokMerhabaYaz(int miktar) {
        for (int i = 0; i < miktar; i++) {
            System.out.println("Merhaba");
        }


    }
}
