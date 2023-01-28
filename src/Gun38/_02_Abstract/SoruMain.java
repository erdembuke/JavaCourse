package Gun38._02_Abstract;

// 1- içinde name field ı olan Sekil isimli bir Abstract Class yazınız.
// 2- Bu classın Alan ve cevre abstract metodları ve içind eAlan ve cevre nin sonucu olan toString somut metodu,
// sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
// 3- Bu sınıftan Dikdörtgen ve Daire isimli 2 class oluşturunuz.
// 4- Bunlardan birer örnek main metodunda çalıştırınız.

public class SoruMain {

    public static void main(String[] args) {
        Sekil sekil1 = new Dikdortgen38(2,7);
        sekil1.sekilCiz();
        sekil1.alan();
        sekil1.cevre();
        System.out.println("sekil1 = " + sekil1);

        Sekil sekil2 = new Daire38(5);
        sekil2.sekilCiz();
        sekil2.alan();
        sekil2.cevre();
        System.out.println("sekil2 = " + sekil2);
    }
}
