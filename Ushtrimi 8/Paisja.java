
public class Paisja {
    String nrSerik;
    String prodhuesi;
    int voltazhi;
    char kategoriaShpenzuese;

    public Paisja(String nrS, String prodhuesi, int voltazhi, char kategoriaShpenzuese) {
        nrSerik = nrS;
        this.prodhuesi = prodhuesi;
        this.voltazhi = voltazhi;
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }

    public String getNrSerik() {
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

    public void setProdhuesi(String p) {
        prodhuesi = p;
    }

    public void setVoltazhi(int volt) {
        voltazhi = volt;
    }

    public void setKategoria(char kategoria) {
        kategoriaShpenzuese = kategoria;
    }

    public String toString() {
        return nrSerik + " : " + prodhuesi + " " + voltazhi + " - " + kategoriaShpenzuese;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Paisja) {
            Paisja dvd = (Paisja) obj;
            if (dvd.getNrSerik().equals(nrSerik)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Paisja paisja1 = new Paisja("1234-A", "Apple", 5, 'A');
        Paisja paisja2 = new Paisja("1234-B", "Samsung", 5, 'B');
        Paisja paisja3 = new Paisja("1234-A", "LG", 3, 'F');

        System.out.println("Paisja 1: ");
        System.out.println("Numri serik: " + paisja1.getNrSerik());
        System.out.println("Prodhuesi: " + paisja1.getProdhuesi());
        System.out.println("Voltazhi: " + paisja1.getVoltazhi());
        System.out.println("Kategoria shpenzuese: " + paisja1.getKategoriaShpenzuese());

        paisja1.setProdhuesi("Samsung");
        paisja1.setVoltazhi(3);
        paisja1.setKategoria('C');

        System.out.println(paisja1.toString());
        System.out.println("Paisja 1  vs Paisja 2: " + paisja1.equals(paisja2));
        System.out.println("Paisja 1 vs Paisja 3: " + paisja1.equals(paisja3));

        System.out.println("------------------------------");

        System.out.println("Paisja 2: ");
        System.out.println("Numri serik: " + paisja2.getNrSerik());
        System.out.println("Prodhuesi: " + paisja2.getProdhuesi());
        System.out.println("Voltazhi: " + paisja2.getVoltazhi());
        System.out.println("Kategoria shpenzuese: " + paisja2.getKategoriaShpenzuese());


        paisja2.setProdhuesi("Apple");
        paisja2.setVoltazhi(5);
        paisja2.setKategoria('F');


        System.out.println(paisja2.toString());
        System.out.println("Paisja 2 vs Paisja 3: " + paisja2.equals(paisja3));

        System.out.println("------------------------------");

        System.out.println("Paisja 3: ");
        System.out.println("Numri serik: " + paisja3.getNrSerik());
        System.out.println("Prodhuesi: " + paisja3.getProdhuesi());
        System.out.println("Voltazhi: " + paisja3.getVoltazhi());
        System.out.println("Kategoria shpenzuese: " + paisja3.getKategoriaShpenzuese());

        paisja2.setProdhuesi("Xiamoi");
        paisja2.setVoltazhi(9);
        paisja2.setKategoria('L');


        System.out.println(paisja3.toString());

    }

}
