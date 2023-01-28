package Gun36._05_Interface;

public class Test implements IYazdirir,IGosterir{
    @Override
    public void yaz(String msg) {
        System.out.println(msg);
    }

    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yaz() {
        System.out.println("yazdirdi");
    }
}
