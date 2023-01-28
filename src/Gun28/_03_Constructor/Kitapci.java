package Gun28._03_Constructor;

public class Kitapci {
    // Book class yaziniz. fields : name,publishYear,author.
    // 3 adet constrcutor ekleyin
    // kitaplarin ozelliklerini tek bir satirda yazdiran bir metod ekleyin
    // 3 adet kitabi farkli constructor ile olusturup mainde yazin

    // TODO: (uyari olsun diye todo degil) sag tik generate ile yaptik soruyu

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap();
        kitap1.name = "baaa";
        kitap1.publishYear = 1993;
        kitap1.author = "Emrahsilah1993";
        System.out.println("kitap1 = " + kitap1);

        Kitap kitap2 = new Kitap("umrumda degil",2022,"emrahgun1993");
        System.out.println("kitap2 = " + kitap2);

        Kitap kitap3 = new Kitap("sanane",2023);
        System.out.println("kitap3 = " + kitap3);
    }
}
