package A_Homework_29_11_2022_DoWhileForBreakContinue;

public class _04_Soru {
    public static void main(String[] args) {
        // 4 - ilk 10 dogal sayinin toplamini hesaplamak icin bir kod yazin
        // ilk 10 dogal sayi -> 1,2,3,4,5,6,7,8,9,10
        int i = 1;
        int t = 0;

        do {
            t += i;
            i++;
        }while (i <= 10);
        System.out.println("ilk 10 dogal sayi (1,2,3,4,5,6,7,8,9,10) toplami = " + t);
    }
}
