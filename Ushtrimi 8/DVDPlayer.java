
public class DVDPlayer {
    String nrSerik;
    String marka;

    boolean eshteHD;

    public DVDPlayer(String nrS, String marka, boolean hd) {
        nrSerik = nrS;
        this.marka = marka;
        eshteHD = hd;
    }

    public String getNrSerik() {
        return nrSerik;
    }

    public String getMarka() {
        return marka;
    }

    public boolean getEshteHD() {
        return eshteHD;
    }

    public void setMarka(String m) {
        marka = m;
    }

    public void setEshteHD(boolean hd) {
        eshteHD = hd;
    }

    public String toString() {
        return nrSerik + " : " + marka + " - "
                +
                (eshteHD ? "eshte HD" : "nuk eshte HD");
    }

    public boolean equals(Object obj) {
        if (obj instanceof DVDPlayer) {
            DVDPlayer dvd = (DVDPlayer) obj;
            if (dvd.getNrSerik().equals(nrSerik)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DVDPlayer dvd1 = new DVDPlayer("1234-A", "Apple", true);
        DVDPlayer dvd2 = new DVDPlayer("1234-B", "Samsung", false);
        DVDPlayer dvd3 = new DVDPlayer("1234-A", "LG", true);

        System.out.println("DVD1: ");
        System.out.println("Numri serik: " + dvd1.getNrSerik());
        System.out.println("Marka: " + dvd1.getMarka());
        System.out.println("Eshte HD: " + dvd1.getEshteHD());

        dvd1.setMarka("Samsung");
        dvd1.setEshteHD(false);

        System.out.println(dvd1.toString());
        System.out.println("DVD1 vs DVD2: " + dvd1.equals(dvd2));
        System.out.println("DVD1 vs DVD3: " + dvd1.equals(dvd3));

        System.out.println("------------------------------");

        System.out.println("DVD2: ");
        System.out.println("Numri serik: " + dvd2.getNrSerik());
        System.out.println("Marka: " + dvd2.getMarka());
        System.out.println("Eshte HD: " + dvd2.getEshteHD());

        dvd1.setMarka("Apple");
        dvd1.setEshteHD(false);

        System.out.println(dvd2.toString());
        System.out.println("DVD2 vs DVD3: " + dvd2.equals(dvd3));

        System.out.println("------------------------------");

        System.out.println("DVD3: ");
        System.out.println("Numri serik: " + dvd3.getNrSerik());
        System.out.println("Marka: " + dvd3.getMarka());
        System.out.println("Eshte HD: " + dvd3.getEshteHD());

        dvd3.setMarka("LG");
        dvd1.setEshteHD(true);

        System.out.println(dvd3.toString());

    }

}
