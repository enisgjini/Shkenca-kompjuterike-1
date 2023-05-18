public class Vetura {
    String nrTargave; // Ky atribut duhet te jete
    String modeli;
    int vitiProdhimit;

    public Vetura(String numriTargave, String modeliVetures, int vitiProdhimit) {
        nrTargave = numriTargave;
        modeli = modeliVetures;
        this.vitiProdhimit = vitiProdhimit;
    }

    // Merre numrin e targave
    public String getNumriTargave() {
        return nrTargave;
    }

    // Merre modelin e vetures
    public String getModeliVetures() {
        return modeli;
    }

    // Merre vitin e prodhimit
    public int getVitiIProdhimit() {
        return vitiProdhimit;
    }

    public void setModeli(String m) {
        modeli = m;
    }

    public void setVitiIProdhimit(int viti) {
        vitiProdhimit = viti;
    }

    public String toString() {
        return modeli + " - " + vitiProdhimit + " : " + nrTargave;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Vetura) {
            Vetura vetura = (Vetura) obj;
            if (vetura.getNumriTargave().equals(nrTargave)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Vetura vetura1 = new Vetura("04-601-EN", "Opel Zafira", 2005);

        Vetura vetura2 = new Vetura("02-601-EN", "Opel Astra", 2007);

        Vetura vetura3 = new Vetura("04-601-EN", "Opel Mazda", 2005);

        System.out.println("Vetura 1");
        System.out.println("Numri i targave: " + vetura1.getNumriTargave());
        System.out.println("Modeli: " + vetura1.getModeliVetures());
        System.out.println("Viti i prodhimit: " + vetura1.getVitiIProdhimit());

        vetura1.setModeli("Opel Mazda");
        vetura1.setVitiIProdhimit(2006);

        System.out.println(vetura1.toString());
        System.out.println("Vetura e 1 vs Vetura e 2: " + vetura1.equals(vetura2));
        System.out.println("Vetura e 1 vs Vetura e 3: " + vetura1.equals(vetura3));

        System.out.println("------------------------------");

        System.out.println("Vetura 2: ");
        System.out.println("Numri i targave: " + vetura2.getNumriTargave());
        System.out.println("Modeli: " + vetura2.getModeliVetures());
        System.out.println("Viti i prodhimit: " + vetura2.getVitiIProdhimit());

        vetura1.setModeli("Apple");
        vetura1.setVitiIProdhimit(2020);

        System.out.println(vetura2.toString());
        System.out.println("Vetura e 2 vs Vetura e 3: " + vetura2.equals(vetura3));

        System.out.println("------------------------------");

        System.out.println("Vetura 3: ");
        System.out.println("Numri i targave: " + vetura3.getNumriTargave());
        System.out.println("Modeli: " + vetura3.getModeliVetures());
        System.out.println("Viti i prodhimit: " + vetura3.getVitiIProdhimit());

        vetura3.setModeli("LG");
        vetura3.setVitiIProdhimit(2025);

        System.out.println(vetura3.toString());
    }
}
