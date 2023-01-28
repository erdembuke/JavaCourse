package Gun26._02_Ornek;

public class Person {
    String name;
    String surname;
    int age;

    public void BilgiYazdirrr(Person calisan) {
        System.out.println("Employee name is " + "\"" + name + "\"");
        System.out.println("Employee surname is " + "\"" + surname + "\"");
        System.out.println("Employee age is " + "\"" + age + "\"");
    }

    public String toString() {  // direkt soutv ile yazdirabilmek icin
        return name + " " + surname + " " + age;
    }

    public void getBirthYear() {
        System.out.println(name + " " + surname + " age -> " + (2022-age));
    }

    public void getInitials() {
        System.out.println(name + " " + surname + " -> " +
                name.toUpperCase().charAt(0) + "." + surname.toUpperCase().charAt(0) + ".");
    }
}
