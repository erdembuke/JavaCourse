package Gun08;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {
        int sayac = 0;

        sayac = sayac + 1;      // sayacin degerini 1 tane artiriyor :1
        sayac++;            // sayacin degerini 1 tane artiriyor :2
        ++sayac;            // sayacin degerini 1 tane artiriyor :3

        sayac = sayac - 1;      // sayacin degerini 1 tane azaltiyor :2
        sayac--;            // sayacin degerini 1 tane azaltiyor :1
        --sayac;            // sayacin degerini 1 tane azaltiyor :0

        System.out.println("sayac = " + sayac);

        /****************************/
        int toplam = 5 + sayac;  // 5 olur
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        toplam = 5 + sayac++;   // toplam = 5 + sayac ,,,,,,,, sonra sayac=sayac+1
        // sonuc 5 dir
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        toplam = 5 + ++sayac;   // sayac=sayac +1 sonra toplam = 5+sayac 7 olur
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        // Ozet: ++ lar sağda ise ilk islem yapilir sonra sayac artar
        // fakat ++ lar solda ise ilk sayac artar sonra islem yapilir

        // toplam=toplam+sayac -> sayac = sayac +1; /// yerine toplam = toplam + sayac++
        // sayac = sayac+1 -> toplam = toplam + sayac; /// yerine toplam = toplam + ++ sayac;



    }
}
