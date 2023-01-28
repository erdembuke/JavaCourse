package Gun28._02_Constructor;

public class Kitapci {
    // Book class yaziniz. fields : name,publishYear,author.
    // 3 adet constrcutor ekleyin
    // kitaplarin ozelliklerini tek bir satirda yazdiran bir metod ekleyin
    // 3 adet kitabi farkli constructor ile olusturup mainde yazin
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Java'yi ogrenmek";
        book1.publishYear = 2022;
        book1.author = "Erdem BUKE";
        System.out.println("book1 = " + book1.name);
        System.out.println("\"" + book1.name + "\"" + " publish year is " + book1.publishYear);

        System.out.println();

        Book book2 = new Book("Test Tool'larinda Uzmanlasmak",2023,"Erdem BUKE");
        System.out.println("book2 = " + book2.name);
        System.out.println("\"" +book2.name + "\"" + " author is " + book2.author);

        System.out.println();

        Book book3 = new Book("ismet hoca ile java yollari",2002);
        System.out.println("book3 = " + book3.name);
        System.out.println("\"" +book3.name + "\"" + " publish year is " + book3.publishYear);

        System.out.println();

        System.out.println("book1 = " + book1); // toString metodunu Book classinda
        System.out.println("book2 = " + book2); // cagirdik onun sayesinde yazdirabildik
        System.out.println("book3 = " + book3); // soutv ile

    }
}
