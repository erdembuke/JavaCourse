package Gun04;

public class _08_Ornek3 {
    public static void main(String[] args) {
        // Soru : string olarak verilen 2 adet bagis parasinin toplamini yazdiriniz

        String bagis1="13000";
        String bagis2="7000";

        int bagisA=Integer.parseInt(bagis1);
        int bagisB=Integer.parseInt(bagis2);

        int bagisToplam=bagisA+bagisB;

        System.out.println("bagisToplam = " + bagisToplam);

        String bagislartoplam=Integer.toString(bagisToplam);
        System.out.println("bagislartoplam = " + bagislartoplam);

    }
}
