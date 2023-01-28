package Gun35._02_Polymorphizm;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("auvh-auvh..");
    }

    public void sniffed() {
        System.out.println("the dog sniffed");
    }
}
