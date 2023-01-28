package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        //toLowerCase : stringi kucuk harfe cevirir.

        String text = "Merhaba Dünya";

        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dunya

        System.out.println("me ile veya ME ile başlıyor mu = " + text.toLowerCase().startsWith("me"));
        // ilk kücüge cevirir sonra me ile basliyor mu kontrol eder

        System.out.println("text = " + text); // kendisine atama yazmazsak kendisi degismez




    }
}
