package Gun34._03_Protected.Paket2;

import Gun34._03_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan ha = new P1Hayvan();
        ha.ad = "inek";
        // ha.yas ulasilamadi    - "default" -
        // ha.cinsi ulasilamadi  - "protected" -

    }
}
