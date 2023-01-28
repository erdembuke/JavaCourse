package Gun27._02_Ornek;

public class Soru {
    // Math sinifindaki metodlardan 5 tanesini
    // kendi isimlendirmenizle ayri bir sinifa yazarak
    // (Kendi metodonuzun icinde Math.fonksiyonlarini kullanabilirsiniz
    // mainden nesne olusturmadan direkt kullanilmasini saglatacak örnek
    // kullanimlarini yaziniz.
    public static void main(String[] args) {
        int mutlakDeger = MathFunctions.absolute(-5);
        int toplamlari = MathFunctions.total(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int buyukSayi = MathFunctions.maximum(1, 20);
        int kucukSayi = MathFunctions.minimum(-5, -7);
        int randomSayi = MathFunctions.takeRandom(20);

        System.out.println("mutlakDeger = " + mutlakDeger);
        System.out.println("toplamlari = " + toplamlari);
        System.out.println("kucukSayi = " + kucukSayi);
        System.out.println("buyukSayi = " + buyukSayi);
        System.out.println("randomSayi = " + randomSayi);

    }
}
