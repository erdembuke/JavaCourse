package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1 = 98;
        byte ogrNot2 = 98;
        byte ogrNot3 = 98;
        byte ogrNot4 = 98;

        int toplam = ogrNot1;  // byte -> int dönüsünce problem cikmadi
        // cunku byte icin hafizada ayrilan yer int e sigar, sigdigi icin problem cikmadi
        // cunku veri kaybi olma ihtimali yok ****(genisletme var - Widing Casting)****


        ogrNot1 = (byte) toplam;     // int -> byte dönüsmeye calisinca problem cikti
        // buyuk hazifa ayrilmis bi alani kucuk hafiza ayrilmis alana atma islemi var
        // veri kaybi ihtimali var ****(daraltma var - Narrow Casting)****

        // byte -> short -> int -> long -> float -> double                              ****genisletme****
        // double -> float -> long -> int -> char(henuz anlatilmadi) -> short ->byte      ****daraltma****




    }
}
