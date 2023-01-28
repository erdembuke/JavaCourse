package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Soru : Kisinin agirligini double , boyunu int olarak deger ver
        // bir satirda boyunuz ... ve kilonuz .. seklinde yazdiriniz
        // vucut kitle indexini de bularak yazdiriniz ( kg/boy*boy

        double agirlik = 82.7;
        int boy = 174;
        double kitleIndex = agirlik / (boy * boy);

        System.out.println("Boyunuz " + boy + " Kilonuz " + agirlik + " Vucut Kitle Indexiniz " + kitleIndex);

        double boy2 = 1.74;
        double kitleIndex2 = agirlik / (boy2 * boy2);

        System.out.println("Boyunuz " + boy2 + " Kilonuz " + agirlik + " Vucut Kitle Indexiniz " + kitleIndex2);




    }
}
