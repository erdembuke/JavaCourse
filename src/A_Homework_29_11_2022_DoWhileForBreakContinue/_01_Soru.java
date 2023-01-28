package A_Homework_29_11_2022_DoWhileForBreakContinue;

public class _01_Soru {
    public static void main(String[] args) {
        // 1- 0 ile 100 arasindaki bütün cift sayilari yazdirabilcegimiz bir kod yaziniz
        // not : 0 ve 100 dahildir
        int sayac = 0;
        System.out.println("0 ve 100 arasindaki çift sayilar asagidadir (0 ve 100 dahildir)");
        do {
            if (sayac % 2 == 0) {
                System.out.println(sayac);
            }
            sayac++;
        }while (sayac <= 100);
    }
}
