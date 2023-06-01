public class Kamarieri {
    int id;
    String emri;
    int vitiILindjes;
    String orariPunes;
    double pagaMujore;

    public Kamarieri(int i, String e, int v, String o, double paga) {
        id = i;
        emri = e;
        vitiILindjes = v;
        orariPunes = o;
        pagaMujore = paga;

    }

    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public int getVitiILindjes() {
        return vitiILindjes;
    }

    public String getOrariPunes() {
        return orariPunes;
    }

    public double getPagaMujore() {
        return pagaMujore;
    }

    public void setEmri(String em) {
        emri = em;
    }

    public void setVitiLindjes(int viti) {
        vitiILindjes = viti;
    }

    public void setOrariPunes(String o) {
        orariPunes = o;
    }

    public void setPagaMujore(double paga) {
        pagaMujore = paga;
    }

    public String toString() {
        return id + " : " + emri + " - " + vitiILindjes + " punon me orar " + orariPunes + " dhe ka pagen "
                + pagaMujore;
    }

    public boolean equals(Object o) {
        if (o instanceof Kamarieri) {
            Kamarieri k = (Kamarieri) o;
            if (k.getId() == id) {
                return true;
            }
        }
        return false;
    }



    

}
