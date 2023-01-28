package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {

        // Escape Characters
        // \n -> yeni satir aciyor, alt satira geciyor
        // \t -> sanki tab tusuna basilmis gibi bosluk veriyor
        // \b -> back-space bir karakter geri siler
        // \" -> tirnak yazmak icin kullaniliyor
        // \\ -> Ters slash yazilmak icin kullaniliyor
        // \r -> satirin basina geri donuyor ve satiri silip tekrar bastan yaziyormus gibi yapar



        System.out.println("HelloWorld"); // HelloWorld seklinde bitisik yazar
        System.out.println("Hello\nWorld"); // Hello (alt satira gecer) World seklinde yazar
        /*  print veya println  \ gorunce bu ekrana yazilacak bir karakter degil
            ayri bir is yapmam isteniyor diyor, devamindaki n karakterini gorunce de
            ayri isin alt satira gecmek oldugunu anlıyor (n harfi alt satira gec demek)   */
        System.out.println("Hello\tWorld");  // Hello   World
        System.out.println("Hello\bWorld");  // HellWorld
        System.out.println("Hello\"World");  // Hello"World
        System.out.println("Hello\\World");  // Hello\World
        System.out.println("Hello\rWorld");  // World








    }
}
