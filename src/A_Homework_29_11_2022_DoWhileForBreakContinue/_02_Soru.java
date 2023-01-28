package A_Homework_29_11_2022_DoWhileForBreakContinue;

public class _02_Soru {
    public static void main(String[] args) {
        // 2- 0 ile 100 arasindaki butun tek sayilari yazdirabilecegimiz bi kod yazin

        int i = 1;

        System.out.println("0 ile 100 arasindaki bütün tek sayilar -");
        do {
            if (i % 2 !=0) {
                System.out.println(i);
            }
            i++;

        }while (i<100);
    }
}
