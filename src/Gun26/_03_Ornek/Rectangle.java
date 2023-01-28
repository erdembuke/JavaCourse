package Gun26._03_Ornek;

public class Rectangle {
    String adi;
    int width;
    int length;

    public void getCevre() {
        System.out.println(adi + " Cevresi -> " + ((width+length)*2) + " cm");
    }
    public void getAlan() {
        System.out.println(adi + " Alani -> " + (width*length) + " m2");
    }
}

