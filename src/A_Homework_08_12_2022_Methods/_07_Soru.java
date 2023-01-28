package A_Homework_08_12_2022_Methods;

public class _07_Soru {
    public static void main(String[] args) {
        // powerOfThree isminde bir method olusturun
        // parametre olarak int , return tipi olarak boolean
        // bir tamsayi verildiginde , 3 üssü olup olmadigini teyit edin. 3 ün üssü(kuvveti) ise true , degilse false yazdir
        // örnek : Girdi 27 / Cikti = true
        // Aciklama : 3*3*3 = 27 / Sonuc = true

        System.out.println("3 ün üssü mü = " + powerOfThree(27));

    }
    public static boolean powerOfThree(int s1) {
        int carpim = 1;
        boolean b1 = false;

        do {
            carpim = (carpim*3);

            if (carpim == s1) {
                b1 = true;
                break;
            }

        }while (carpim < s1);

        return b1;
    }
}
