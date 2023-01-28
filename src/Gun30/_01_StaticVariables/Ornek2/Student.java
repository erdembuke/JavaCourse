package Gun30._01_StaticVariables.Ornek2;

public class Student {
    int id;
    String fullName;

    static int sayac=1;
    // static olmadan her zaman 0 ile basliyordu
    // static oldugunda artik hep bir tane oldugundan
    // degerini korudu ve hep 1 artti;

    public Student(String fullName) {
        this.id = sayac++;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return id + " -> " + fullName;
    }
}
