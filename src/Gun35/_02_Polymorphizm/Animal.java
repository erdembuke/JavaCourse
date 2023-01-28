package Gun35._02_Polymorphizm;

public class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }
    public void animalSound() {
        System.out.println("talked");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
