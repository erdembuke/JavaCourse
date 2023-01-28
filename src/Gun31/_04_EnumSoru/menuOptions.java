package Gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Arrays;

public class menuOptions {
    public void menuOptions(ArrayList<Object> options) {
        this.options = options;
    }
    Pizza small = Pizza.SMALL;
    Pizza medium = Pizza.MEDIUM;
    Pizza large = Pizza.LARGE;

        ArrayList<Object> options = new ArrayList<>(Arrays.asList("1-Small " + small.price + " TL / " + small.cm + " cm"
                ,"2-Medium " + medium.price + " TL / " + medium.cm + " cm"
                ,"3-Large " + large.price + " TL / " + large.cm + " cm"
                ,"4-Sepeti Goster","5- Siparis ver","6- Çıkış"));
}

