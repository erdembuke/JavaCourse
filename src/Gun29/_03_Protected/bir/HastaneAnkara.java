package Gun29._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doktor dok1 = new Doktor();
        dok1.adi = "Erdem";
        dok1.bolumu = "Cildiye";
        dok1.hastaneAd = "Ankara Hastanesi";

        Doktor dok2 = new Doktor("Mehmet");
    }
}
