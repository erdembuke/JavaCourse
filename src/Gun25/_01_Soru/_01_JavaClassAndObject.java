package Gun25._01_Soru;

// class-tiplerin tanimlandigi yer (Class-Object)

public class _01_JavaClassAndObject {

    // metodlarin yazildigi yer
    public static void main(String[] args) { // basla
        // ana programin basladigi calistigi yer

        int sayi = 5;

        Araba benimArabam = new Araba(); // Araba tür(class) , benimArabam ise nesne (object)
        benimArabam.marka = "Volvo";
        benimArabam.renk = "Bok yesili";
        benimArabam.motorHacmi = 1944;
        benimArabam.yili = 2001;

        System.out.println("benimArabam = " + benimArabam.marka);
        System.out.println("benimArabam = " + benimArabam.renk);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.yili = " + benimArabam.yili);
    }   //dur

    //metodlarin yazildigi yer

}
// class-tiplerin tanimlandigi yer (Class-Object)
class Araba {
    String renk;
    int yili;
    String marka;
    int motorHacmi;
}
