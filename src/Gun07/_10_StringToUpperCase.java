package Gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase : string büyük harfe çevirir

        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());
        System.out.println("me veya ME ile basliyor mu = " +
                text.toUpperCase().startsWith("ME")); // buyuttugumuz icin ME yazdik true cikacak
        System.out.println("text = " + text);







    }
}
