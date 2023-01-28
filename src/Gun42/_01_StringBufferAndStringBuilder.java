package Gun42;

public class _01_StringBufferAndStringBuilder {

    public static void main(String[] args) {

        String cumle = "";

        cumle += "Bugun"; // + işareti stringlerde birleştirme yapar
        cumle += " hava"; // atama ister
        cumle += " cok soguk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat() = " + cumle.concat(" fakat dun sicakti"));
        System.out.println("cumle = " + cumle);

        cumle = cumle.concat(" fakat dun sicakti"); // concat de birlestirir , atama ister
        System.out.println("cumle = " + cumle);

        // --------- StringBuilder ----------- //
        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugun ");  // append : ekle , atama gerektirmez, ekler
        cumle2.append(" hava");
        cumle2.append(" soguk");

        System.out.println("cumle2 = " + cumle2);

        // ---------- + , concat , StringBuilder 3 modelin hiz testleri ---------- //

        long startTime = System.currentTimeMillis();
        String test1 = "";
        for (int i = 0; i < 10000; i++)
            test1 += " merhaba";

        System.out.println("+ icin sure " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        String test2 = "";
        for (int i = 0; i < 10000; i++)
            test2 = test2.concat(" merhaba");

        System.out.println("concat icin sure -> " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 10000; i++)
            test3.append(" merhaba");

        System.out.println("StringBuilder icin sure -> " + (System.currentTimeMillis() - startTime) + " ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("*******************\n\n");

        // ----- StringBuilder'i biraz yakindan taniyalim ------ //

        StringBuilder sb = new StringBuilder();
        sb.append("Bugun ");  // kendine ekleme , atama gerektirmez (concat da gerekirdi)
        sb.append("hava ");
        sb.append("guzel");
        System.out.println("sb cumlesi = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4); // eklenen her şeyi toString hali var ise çevirerek ekler.
        System.out.println("sb 4 eklenmis cumle = " + sb);

        sb.reverse(); // Stringi terse çevirir.
        System.out.println("sb ters hali = " + sb);
        sb.reverse();
        System.out.println("sb tersinin tersi = " + sb);

        sb.delete(0, 5); // (index) 0 dahil , 5 hariç olmak üzere siler.
        System.out.println("sb 0,5 silinmis hali = " + sb);

        sb.deleteCharAt(3); // sadece belirtilen index deki karakteri siler.
        System.out.println("sb 3. chardaki silinmis hali = " + sb);

        sb.insert(5, "Bugun "); // 5 no lu index e kelimeyi ekle : araya ekle
        System.out.println("sb 5 e bugun eklenmis hali = " + sb);

        System.out.println("-----------------");

        sb = new StringBuilder("Bugun hava çok soguk");  // sifirlandi ve ilk deger atandi.
        System.out.println("sb yeni = " + sb);

        sb.replace(3,8,"bu"); // verilen araligi girilen string ile degistir
        System.out.println("sb 3,8,bu replace hali = " + sb);

        String strSb = sb.toString();

        StringBuffer sBuffer = new StringBuffer();
        // tek farki , paralel calisan yazilimlarda , StringBuffer kullanilir


    }
}
