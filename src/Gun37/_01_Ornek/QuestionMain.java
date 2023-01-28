package Gun37._01_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionMain {
    public static void main(String[] args) {
        TeslaCar tesla1 = new TeslaCar("Tesla Model Y",525.5);
        ToyotaPrius tp1 = new ToyotaPrius("Toyota Prius 2004",1.8);
        Bus kamilkoc = new Bus("Mercedes-Benz Bus 2022", 7.2);

        ArrayList<Vehicle> vehicleList = new ArrayList<>(Arrays.asList(tesla1,
                tp1,kamilkoc));
        for (Vehicle ads: vehicleList) {
            System.out.println(ads.getClass().getSimpleName()); // class adi yazdirir
            System.out.println(ads.getModel() + " = " + ads);
            System.out.println();
        }



    }
}
