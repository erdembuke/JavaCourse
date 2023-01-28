package Gun26._02_Ornek;


public class Ornek {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırını
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    // bu metod çalıştığında kişinin doğum yılını versin.
    // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    // şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D
    public static void main(String[] args) {
        Person cal1 = new Person();
        cal1.name = "Hatice";
        cal1.surname = "Demir";
        cal1.age = 30;

        Person cal2 = new Person();
        cal2.name = "Muhammed";
        cal2.surname = "Gurdal";
        cal2.age = 35;

        System.out.println("cal1 = " + cal1); // toString ekledik direkt yazdirabildi
        cal1.getBirthYear();
        cal2.getBirthYear();
        cal1.getInitials();
        cal2.getInitials();
    }
}
