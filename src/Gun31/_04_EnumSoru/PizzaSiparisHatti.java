package Gun31._04_EnumSoru;


import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.

    public static void main(String[] args) {

        Scanner scInt = new Scanner(System.in);
        menuOptions actions = new menuOptions();

        ArrayList<Pizza> sepet = new ArrayList<>();
        System.out.println("Pizza siparis hattina hosgeldiniz");
        for (int i = 0; i < actions.options.size(); i++) {
            System.out.println(actions.options.get(i));
        }
        boolean bittiMi=false;
        while(!bittiMi) {
            System.out.print("Seçiminiz -> ");
            int secim = scInt.nextInt();

            switch(secim) {
                case 1: sepet.add(Pizza.SMALL);
                    System.out.println("\"Small\" boy pizza sepete eklendi " + "(+" + Pizza.SMALL.price + "TL)");
                    break;

                case 2: sepet.add(Pizza.MEDIUM);
                    System.out.println("\"Medium\" boy pizza sepete eklendi " + "(+" + Pizza.MEDIUM.price + "TL)");
                    break;

                case 3: sepet.add(Pizza.LARGE);
                    System.out.println("\"Large\" boy pizza sepete eklendi " + "(+" + Pizza.LARGE.price + "TL)");
                    break;

                case 4:
                    if(sepet.size() == 0) {
                        System.out.println("Sepetinizde ürün bulunmamaktadır !");
                    }else {
                        for (Pizza spt : sepet) {
                            System.out.println(spt + " boy pizza " + "(" + spt.price + "TL)");
                        }
                        sepetTopla(sepet);
                    }
                    break;

                case 5:
                    if (sepet.size() == 0) {
                        System.out.println("Sepetiniz boş ! tekrar deneyin");
                    }else {
                        System.out.println("Siparis verildi ! ortalama 30-45dk icinde teslim edilecektir.");
                        sepetTopla(sepet);
                        System.out.println("Afiyet olsun !");
                        bittiMi = true;
                    }
                    break;

                case 6:
                    System.out.println("iyi gunler, tekrar bekleriz");
                    System.exit(1);
                default:
                    System.out.println("yanlis tuslama yaptiniz, tekrar deneyin");
            }
        }
    }

    static void sepetTopla(ArrayList<Pizza> a) {
        int toplam = 0;
        for (Pizza abd : a) {
            toplam += abd.price;
        }
        System.out.println("Sepetteki ürünlerin toplamı " + toplam + " TL");
    }

}
