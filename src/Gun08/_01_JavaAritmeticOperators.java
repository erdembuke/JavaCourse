package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("toplama islemi");
        System.out.println("a+b = " + (a+b));

        System.out.println("carpma islemi");
        System.out.println("a*b = " + (a*b));

        System.out.println("bolme islemi");
        System.out.println("a/b = " + (a/b));
        // normal sonuc 1.8 ama int oldugu icin küsüratı atar. tam sonuc icin double cevirmeliyiz ;
        System.out.println("a/b with double = " + ((double)a/b));

        System.out.print("Modül işlemi");
        System.out.println("(a % b) sonucu = " + (a % b));
        System.out.println("(b % a) sonucu = " + (b % a));
        // kisa onemli not!
        // Modül (%) de sol büyük ise kalanı al sol kücükse solundakini al




    }
}
