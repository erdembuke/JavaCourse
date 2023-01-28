package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        // Kullanicinin girdigi gün numarasina karsilik gelen günün adını yazin

        Scanner oku = new Scanner(System.in);
        System.out.print("Gün no -> ");
        int gunNo = oku.nextInt();

        /*
        if (gunNo == 1) {
            System.out.println("Pazartesi");
        }
        if (gunNo == 2) {
            System.out.println("Sali");
        }
        .....
        .....

        */

        switch (gunNo){
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Sali");      break;
            case 3: System.out.println("Carsamba");  break;
            case 4: System.out.println("Persembe");  break;
            case 5: System.out.println("Cuma");      break;
            case 6: System.out.println("Cumartesi"); break;
            case 7: System.out.println("Pazar");     break;
            default : System.out.println("Hatali Numara !");
        }
        // if ' lerde tek değer olması durumunda , 2 den fazla if kullanmak gerekiyorsa SWITCH
        // diger durumlarda if ( SWITCH DE ARALIK VERİLMEZ TEK DEGER VARSA KULLANILIR)
    }
}
