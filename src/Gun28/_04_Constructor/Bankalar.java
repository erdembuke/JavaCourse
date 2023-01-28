package Gun28._04_Constructor;

public class Bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {
        Banka bank1 = new Banka();
        bank1.adi = "AKBANK";
        bank1.subeSayisi = 257;
        bank1.kurulusYili = 1957;
        System.out.println("bank1 = " + bank1);

        Banka bank2 = new Banka("YapiKredi",570);
        System.out.println("bank2 = " + bank2);

        Banka bank3 = new Banka("AlBaraka",103);
        System.out.println("bank3 = " + bank3);

    }
}
