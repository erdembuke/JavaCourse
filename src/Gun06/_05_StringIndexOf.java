package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // 01234 : harflerin oda numaralari 0 dan baslar: index
        // Bugun

        String cumle = "Merhaba Dünya";
        // h nin index i kaç
        // m nin index i kaç
        // 0(506)3445567 -> ( in oda numarasi (index) kaç

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M"));
        System.out.println("cumle a index = " + cumle.indexOf("a"));
        System.out.println("cumle ha index = " + cumle.indexOf("ha"));
        System.out.println("cumle bosluk index = " + cumle.indexOf(" "));
        System.out.println("cumle A index= " + cumle.indexOf("A")); // -1 yok demek

        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf("a", 5)); // 6 ???? str index yapamadim
        // a yi aramaya 5(dahil) nolu  (FROM INDEXOF BU)




    }
}
