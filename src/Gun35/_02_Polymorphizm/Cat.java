package Gun35._02_Polymorphizm;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("meowww..");
    }

    public void licked() {
        System.out.println("the cat licked");
    }
}
