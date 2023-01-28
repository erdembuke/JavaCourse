package Gun31._01_Enum;

public class Ornek1 {
    public static void main(String[] args) {
        // verilen bir ay no ya göre , ayin gun sayisini
        // veren programi yazin

        int ayNo = 5;

        switch (ayNo) {
            case 2 :
                System.out.println(28);  break;
            case 1:
            case 3:
            case 5:
            case 22:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
        }
        /* okunulabilirlik ve kontrollu yazilim yok tanimlama yaparken
         numaradan gitmeye calistik zorluklarla karsilastik
         bunun yerine isimden gitmeye calisalim
         */

        String ayAd = "Mayis";
        switch (ayAd) {
            case "şubat" :
                System.out.println(28);
                break;
            case "Ocak":
            case "mart":
            case "agustos":
            case "haziran":
            case "aralik":
                System.out.println(31);
                break;
            case "temuz":
            case "eylul":
            case "Ekim":
            case "KASIM":
                System.out.println(30);
                break;
        }
        /* kontrol zor hataya acik
         Boolean True 1 , False 0

         kullanici tipi : Role :
         student , teacher ,admin , mentor

         if (kullanici == Role.student) {

         }
         else {

         }

         */
    }
}
