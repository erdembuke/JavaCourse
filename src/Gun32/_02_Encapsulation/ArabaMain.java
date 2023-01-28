package Gun32._02_Encapsulation;

public class ArabaMain {
    // Bir araba nesnesi olusturulmak isteniyor. fields (Renk , Model , MotorHacmi , KapiSayisi)
    // Bu nesnenin verilerini OOP Kurallarina uygun olarak verip aliniz
    // Main de 1 tane nesne olusturup bunu kontrol edin.
    public static void main(String[] args) {
        Araba volvoV40 = new Araba();
        volvoV40.setColor("Green");
        volvoV40.setModel(2001);
        volvoV40.setEngineCC(1949);
        volvoV40.setDoorAmount(5);

        System.out.println(volvoV40.getColor());
        System.out.println(volvoV40.getModel());
        System.out.println(volvoV40.getEngineCC());
        System.out.println(volvoV40.getDoorAmount());

        System.out.println("Volvo v40 2.0 T4 = " + volvoV40);

        Araba volvos40 = new Araba("beyaz",2004,1949,5);
        /*
        constructor kullanarak yaptigimizda yili 2030 girince hata vermedi cunku
        metod kullanmadan direkt constructor ile atadik degerleri, o yuzden constructordaki
        this.color = color seklinde tanimlamayi silip yerine metodlari cagirarak yine
        constructor icinde kontrol saglayarak atama yaptirdik ve sorun kalmadi.
         */
        System.out.println("volvos40 = " + volvos40);

    }

}
