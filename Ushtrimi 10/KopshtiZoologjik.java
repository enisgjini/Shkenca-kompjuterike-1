public class KopshtiZoologjik {
    private final String emri;
    private final String lokacioni;
    private Kafsha[] vargu;
    private int index = 0;

    public KopshtiZoologjik(String emri, String lokacioni, int nrKafsheve) {
        this.emri = emri;
        this.lokacioni = lokacioni;
        vargu = new Kafsha[nrKafsheve];
    }

    public boolean ekziston(Kafsha k) {
        for (int i = 0; i < index; i++) {
            if (k.equals(vargu[i])) {
                return true;
            }
        }
        return false;
    }

    public void shtoKafshen(Kafsha k) {
        if (k == null) {
            System.out.println("Kafsha eshte e painicializuar");
        } else if (ekziston(k)) {
            System.out.println(k + " vetem se ekziston!");
        } else if (index == vargu.length) {
            System.out.println("Nuk ka vend per: " + k);
        } else {
            vargu[index++] = k;
        }
    }

    public Kafsha[] ktheKafshet(String lloji) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (vargu[i].getLloji().equals(lloji)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Kafsha[] rezultati = new Kafsha[count];
        int j = 0;
        for (int i = 0; i < index; i++) {
            if (vargu[i].getLloji().equals(lloji)) {
                rezultati[j++] = vargu[i];
            }
        }

        return rezultati;
    }

    public void shtypKafshenMeTeVogel() {
        if (index == 0) {
            System.out.println("Nuk ka kafshe ne kopsht.");
            return;
        }

        Kafsha kafshaMeTeVogel = vargu[0];
        for (int i = 1; i < index; i++) {
            if (vargu[i].getMosha() < kafshaMeTeVogel.getMosha()) {
                kafshaMeTeVogel = vargu[i];
            }
        }

        System.out.println("Kafsha me te vogel: " + kafshaMeTeVogel);
    }

    public static void main(String[] args) {
        KopshtiZoologjik kopshti = new KopshtiZoologjik("Bota e kafsheve", "Shkup", 8);

        Kafsha k1 = new Kafsha("Luan", "Kafsha 1", 12);
        Kafsha k2 = new Kafsha("Bretkoca", "Kafsha 2", 1);
        Kafsha k3 = new Kafsha("Tiger", "Kafsha 3", 8);
        Kafsha k4 = new Kafsha("Leopard", "Kafsha 4", 5);
        Kafsha k5 = new Kafsha("Krokodil", "Kafsha 5", 7);
        Kafsha k6 = new Kafsha("Papagall", "Kafsha 6", 15);
        Kafsha k7 = new Kafsha("Zog", "Kafsha 7", 18);
        Kafsha k8 = new Kafsha("Qene", "Kafsha 8", 97);
        Kafsha k9 = new Kafsha("Gjirafe", "Kafsha 9", 46);

        kopshti.shtoKafshen(k1);
        kopshti.shtoKafshen(k2);
        kopshti.shtoKafshen(k3);
        kopshti.shtoKafshen(k4);
        kopshti.shtoKafshen(k5);
        kopshti.shtoKafshen(k6);
        kopshti.shtoKafshen(k7);
        kopshti.shtoKafshen(k8);
        kopshti.shtoKafshen(k9);

        Kafsha kafshaTest = new Kafsha("Maca", "Ico", 12);
        System.out.println("Ekziston kafshaTest: " + kopshti.ekziston(kafshaTest));

        System.out.println("Kafshet e llojit \"Luan\":");
        Kafsha[] luanet = kopshti.ktheKafshet("Luan");
        if (luanet != null) {
            for (Kafsha kafsha : luanet) {
                System.out.println(kafsha);
            }
        } else {
            System.out.println("Nuk ka kafshe te llojit \"Luan\"");
        }

        kopshti.shtypKafshenMeTeVogel();
    }
}
