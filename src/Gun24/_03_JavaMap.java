package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kisi icin yapiniz

        HashMap<String,String> uKartvizit = new HashMap<>();
        uKartvizit.put("isim", "Ugur YILMAZ");
        uKartvizit.put("email", "ugury@gmail.com");
        uKartvizit.put("Adres", "Beykoz / Istanbul");
        uKartvizit.put("telefon", "+90 535 019 08 86");

        System.out.println("Ad = " + uKartvizit.get("isim"));
        System.out.println("Telefon = " + uKartvizit.get("telefon"));

        HashMap<String,String> aKartvizit = new HashMap<>();
        aKartvizit.put("isim", "Ayse Bayrak");
        aKartvizit.put("email", "ayseb@gmail.com");
        aKartvizit.put("adres", "Sisli / Istanbul");
        aKartvizit.put("telefon", "+90 535 019 08 87");

        HashMap< String,HashMap<String,String> > kartvizitler = new HashMap<>();
        
        kartvizitler.put("ugur", uKartvizit);
        kartvizitler.put("ayse", aKartvizit);

        System.out.println("kartvizitler.get(\"ugur\") = " + kartvizitler.get("ugur"));
        System.out.println("kartvizitler.get(\"ayse\") = " + kartvizitler.get("ayse"));

        // aysenin adresi
        System.out.println("Aysenin adresi = " + kartvizitler.get("ayse").get("adres"));

        // sadece mailler
        for (Map.Entry<String,HashMap<String,String>> kv : kartvizitler.entrySet()) {
            System.out.println("e mailler -> " + kv.getValue().get("email"));
        }
    }
}
