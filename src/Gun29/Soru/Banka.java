package Gun29.Soru;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int))
    // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri();
        musteri1.ad = "Erdem";
        musteri1.soyad = "BUKE";
        musteri1.hesapID = 130420;
        musteri1.hesap1.paraYatir(100);
        musteri1.hesap1.paraYatir(100);
        musteri1.hesap1.paraYatir(100);
        musteri1.hesap1.paraCek(25);
        musteri1.hesap1.bakiyeGoster();

        System.out.println(musteri1.hesap1);

    }
}
