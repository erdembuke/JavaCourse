package B_Mentoring4;

public class _02_Ornek {
    public static void main(String[] args) {
        //carpim tablosunun 1ler,2ler,3ler hanesinin tum sonuclarini ekran a yazdiran bir program yazin

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
