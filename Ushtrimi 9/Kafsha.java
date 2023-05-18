public class Kafsha {

    String lloji;
    String emri;
    int mosha;

    public Kafsha(String ll, String e, int m) {
        lloji = ll;
        emri = e;
        mosha = m;
    }

    public String getLloji() {
        return lloji;
    }

    public String getEmri() {
        return emri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public String toString() {
        return lloji + " - " + emri + " ka moshën " + mosha;
    }

    public boolean equals(Object o) {
        if (o instanceof Kafsha) {
            Kafsha kafsha = (Kafsha) o;
            if (kafsha.getLloji().equals(lloji) && kafsha.getEmri().equals(emri) && kafsha.getMosha() == mosha) {
                return true;
            }
        }
        return false;
    }

}
