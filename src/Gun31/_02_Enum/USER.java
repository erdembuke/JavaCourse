package Gun31._02_Enum;

import java.util.ArrayList;

public class USER {
    String username;

    Role rolu;
    Status statusu;

    public USER(String username, Role rolu, Status statusu) {
        this.username = username;
        this.rolu = rolu;
        this.statusu = statusu;
    }

    static void userDelete(ArrayList<USER> b, USER a) {
        if (a.rolu == Role.ADMIN) {
            System.out.println(a.username + " kullanicisi (admin) silinemez !");
        }else {
            b.remove(a);
            System.out.println(a.username + " kullanicisi basariyla silindi");
        }

    }

    @Override
    public String toString() {
        return "ad -> " + username + " / Title -> " + rolu + " / Durum -> " + statusu;
    }
}
