package Gun31._02_Enum;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim
    public static void main(String[] args) {
        ArrayList<USER> allUsers = new ArrayList<>();

        USER user1 = new USER("erdem buke", Role.ADMIN,Status.AKTIF);
        USER user2 = new USER("halit yesilbas", Role.MUDUR,Status.AKTIF);
        USER user3 = new USER("ismail keskin", Role.SATIS, Status.PASIF);
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        System.out.println("kullanicilar = " + allUsers);
        USER.userDelete(allUsers,user1);
        USER.userDelete(allUsers,user3);
        System.out.println("kullanicilar = " + allUsers);

    }
}
