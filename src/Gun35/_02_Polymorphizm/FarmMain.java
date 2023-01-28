package Gun35._02_Polymorphizm;

import Gun33._02_Ornek.Hayvan;
import Gun33._02_Ornek.Kopek;

public class FarmMain {

    public static void main(String[] args) {
        Dog dog1 = new Dog("karabas");
        dog1.animalSound(); // hav
        dog1.sniffed(); // sniffed

        Cat cat1 = new Cat("inek");
        cat1.animalSound(); // meow
        cat1.licked();  // licke

        dogSound(dog1); // hav
        catSound(cat1); // meow
        soundOfAnimal(dog1);
        soundOfAnimal(cat1);

        ///////////////////////////////////
        // referans tip      // nesne tip
        Animal animal7 = new Animal("dog"); // hayvanlardan 1 hayvan
        Animal animal3 = new Dog("kangal"); // hayvanlardan 1 kopek
        Animal animal4 = new Cat("bulut");  // hayvanlardan 1 kedi

        System.out.println("------------------");
        animal7.animalSound();  // genel hayvan, ses cıkarir
        animal3.animalSound();  // kopek hayvan, havladi
        animal4.animalSound();  // kedi hayvan , meowladi
        System.out.println("------------------");

        animal3.animalSound(); // kopek de olsa hayvan referansı sebebiyle
                               // metodlar kisitli
        ((Dog)animal3).sniffed();   // referans tipini casting yontemi ile
        //((int)Math.Random()       // "Dog" a cevirdik ve ozel metodlarini
                                    // (sniff gibi) kullanabilir hale geldik.
        // Setlerden HashSet
        // Maplerden HashMap
        // Listlerden ArrayList
        ((Cat)animal4).licked();


    }
    public static void dogSound(Dog dog1) {
        dog1.animalSound();
    }
    public static void catSound(Cat cat1) {
        cat1.animalSound();
    }
    public static void soundOfAnimal(Animal animal) {
        // buraya hem kedı hem kopek geliyor
        animal.animalSound();

        // bir classin aslinda kim oldugunu bulma yontemi.
        if (animal instanceof Dog)
            ((Dog)animal).sniffed();
        if (animal instanceof Cat)
            ((Cat)animal).licked();
    }
}
