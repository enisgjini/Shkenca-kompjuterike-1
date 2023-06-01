
public class Banesa {
    int id;
    int nrKateve;
    String ngjyra;
    String stiliArkitektonik;
    int vitiNdertimi;

    public Banesa(int id, int nrKateve, String ngjyra, String stiliArkitektonik, int vitiNdertimit) {
        this.id = id;
        this.nrKateve = nrKateve;
        this.ngjyra = ngjyra;
        this.stiliArkitektonik = stiliArkitektonik;
        this.vitiNdertimi = vitiNdertimit;

    }

    public int getID() {
        return id;
    }

    public int getNrKateve() {
        return nrKateve;
    }

    public String getNgjyra() {
        return ngjyra;

    }

    public String getStiliArkitektonik() {
        return stiliArkitektonik;
    }

    public int getVitiINdertimit() {
        return vitiNdertimi;
    }

    public void setNrKateve(int nrKateve) {
        this.nrKateve = nrKateve;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public void setStiliArkitektonik(String stiliArkitektonik) {
        this.stiliArkitektonik = stiliArkitektonik;
    }

    public void setVitiINdertimit(int vitiNdertimi) {
        this.vitiNdertimi = vitiNdertimi;
    }

    public String toString() {
        return "Banesa " + ngjyra + " - " + id + " e ndertuar ne vitin " + vitiNdertimi + " ka " + nrKateve
                + " kate dhe stil arkitektonik " + stiliArkitektonik;
    }

    public boolean equals(Object o) {
        if (o instanceof Banesa) {
            Banesa b = (Banesa) o;
            if (b.getID() == id && b.getVitiINdertimit() == vitiNdertimi) {
                return true;
            }
        }
        return false;
    }

}
