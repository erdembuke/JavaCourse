package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi calisir. farki Kriter(regex)verilebiliyor.

        // TODO (yapilacak) : odev : regex olarak neler yazilabiliyor google dan arastirilacak - gerek kalmadi

        String text = "Merhaba Dünya123";

        System.out.println("text = " + text); // orjinal hali
        System.out.println("abn -> _ " + text.replaceAll("[abn]","_"));
        // a veya b veya n leri _ yap -> Merh___ Dü_y_123

        System.out.println("A-Z -> _ " + text.replaceAll("[A-Z]","_"));
        // A dan z ye kadar BÜYÜK HARFLERİ _ yap -> _erhaba _ünya123

        System.out.println("0-9 -> _ = " + text.replaceAll("[0-9]","_"));
        // 0-9 a kadar olan rakamları _ yap -> Merhaba Dünya___

        System.out.println("text.replaceAll(\"^[0-9]\",\"_\") = " + text.replaceAll("[^0-9]","_"));
        // 0-9 a kadar olan rakamlar disindakileri sil ______ _____123





    }
}
