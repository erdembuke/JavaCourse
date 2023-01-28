package MyUtilities;

public class DenemeClassi {


    public static void waitForIt(int milisecond) {

        try {
            Thread.sleep(1000*milisecond);  // ms bekledigi
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
