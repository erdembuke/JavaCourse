package Gun26.__04_Ornek;

public class Ornek4 {
    public static void main(String[] args) {
        /*
                1. adim : musteri isimli (fields: name) isimli bir class tanimlayiniz
                2. adim : ElektrikHesabi isimli (fields: toplamTuketim(int), birimFiyat(double),
                       fatura(double)) class tanimlayiniz
                3. adim : musteri a bir ElektrikHesabi ekleyin
                4. adim : 1 tane musteri olusturun
                5. adim : musteriye ait her ay tuketilen enerjiyi toplayacak bir metod yaziniz
                       tuketimEkle olsun her verilen aylik rakami toplayarak biriktirsin.
                6. adim : Odenecek rakami toplam tuketimi oran(0.7) ile carparak hesaplatiniz.

                ipucu : hesabi olusturduktan sonra tuketimEkle metoduna 2,3 ay tuketim ekletiniz
                ondan sonra toplam alarak cikartiniz

         */

        musteri musteri1 = new musteri();
        musteri1.name = "Erdem BUKE";
        musteri1.aboneNo = "254604519";
        musteri1.faturaHesapla();








    }
}
