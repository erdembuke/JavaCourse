package Gun07;

public class _11_StringReplace {
    public static void main(String[] args) {
        // replace : bir string icindeki karakter(leri) verilenle degistirir. hepsini

        String text = "Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replace(a,e) = " + text.replace("a","e"));
        System.out.println("text.replace(ba,de) = " + text.replace("ba","de"));
        System.out.println("text.replace(\"Dünya\",\"Java\") = " + text.replace("Dünya","Java"));
        System.out.println("Merhaba Halit = " + text.replace("Dünya","Mal adam"));
        System.out.println("text.replace(\"a\",\" \") = " + text.replace("a"," "));





    }
}
