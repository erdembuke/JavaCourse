package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        // contains : bir stringin icerisinde karakter(lerin) var olup
        // olmadigini boolean cinsinden söyle true ya da false

        String cumle = "Merhaba Dunya";

        boolean varMi = cumle.contains("a");
        System.out.println("a var mi = " + varMi);
    
        // direkt de yapabilirsiniz
        System.out.println("cumle.contains(a) = " + cumle.contains("a"));

        System.out.println("cumle.contains(ya) = " + cumle.contains("ya"));
        
    }
}
