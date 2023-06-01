public class Paisja {
    int nrSerik;
    String prodhuesi;
    int voltazhi;
    char kategoriaShpenzuese;

    public Paisja(int nrS, String p, int v, char k) {
        nrSerik = nrS;
        prodhuesi = p;
        voltazhi = v;
        kategoriaShpenzuese = k;
    }

    public int getNrSerik() {
        return nrSerik;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public int getVoltazhi() {
        return voltazhi;
    }

    public char getKategoriaShpenzuese() {
        return kategoriaShpenzuese;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    public void setVoltazhi(char voltazhi) {
        this.voltazhi = voltazhi;
    }

    public void setKategoria(char kategoriaShpenzuese) {
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }

    public String toString() {
        return nrSerik + " : " + prodhuesi + " " + voltazhi + " - " + kategoriaShpenzuese;
    }

    public boolean equals(Object o) {
        if (o instanceof Paisja) {
            Paisja paisja = (Paisja) o;
            if (paisja.getNrSerik() == nrSerik) {
                return true;
            }
        }
        return false;
    }

}
