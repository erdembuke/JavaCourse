package B_Mentoring3;

import java.util.Scanner;

public class _04_ornek {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int tutulanSayi = (int) (Math.random()*(20-10))+10;
        int tahminEdilenSayi;
        int sayac = 1;

        do {
// System.out.println(tutulanSayi);
            System.out.print("Tahmin giriniz : ");
            tahminEdilenSayi = oku.nextInt();
            if (tahminEdilenSayi==tutulanSayi){
                System.out.println("Tebrikler");break;

            }else if (tahminEdilenSayi != tutulanSayi && sayac != 3){
                System.out.println("Bilemediniz tekrar deneyin");
            }else {
                System.out.println("Bilemediniz Tutulan sayi = "+ tutulanSayi);
            }

            sayac++;

        }while (sayac<=3);
    }
}
