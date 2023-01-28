package Gun42;

public class _04_StringKarsilastirma {

    public static void main(String[] args) {
        // Stringlerde neden == yerine .equals() kullanilmalidir
        String cumle1 = "bugun hava cok guzel";
        String cumle2 = "bugun hava cok guzel";

        if (cumle1 == cumle2)
            System.out.println("cumle 1 cumle 2 ye esit");
        else
            System.out.println("cumle 1 cumle 2 ye esit degil");

        if (cumle1.equals(cumle2))
            System.out.println("cumle 1 cumle 2 ye esit");
        else System.out.println("cumle 1 cumle 2 ye esit DEGİL");


        // ------------ Referans TİPLERDE ise durum --------------- //
        System.out.println("\n***** Referans tiplerde durum *****\n");
        // scanf ile ekrandan okuduğunda asagidaki gibi alir
        String cumle3 = new String("bugun hava cok guzel");
        String cumle4 = new String("bugun hava cok guzel");

        if (cumle3 == cumle4)       // adresleri karsilastirir (ref tip)
            System.out.println("cumle 3 cumle 4 ye esit");
        else
            System.out.println("cumle 3 cumle 4 ye esit degil");

        if (cumle3.equals(cumle4))      // degerler ayni mi.
            System.out.println("cumle 3 cumle 4 ye esit");
        else System.out.println("cumle 3 cumle 4 ye esit DEGİL");


    }
}
