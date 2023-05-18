
public class KopshtiZoologjik {
    String emri;
    String lokacioni;
    Kafsha[] vargu;
    int index = 0;

    public KopshtiZoologjik(String e, String l, int nrKafsheve) {
        emri = e;
        lokacioni = l;
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

    public void shtoPaisjen(Kafsha k) {
        if (k == null) {
            System.out.println("Kafsha eshte e painicializuar");
        } else if (ekziston(k)) {
            System.out.println(k + " vetem se ekziston!");
        } else if (index == vargu.length) {
            System.out.println("Nuk ka vend per: " + k);
        } else {
            vargu[index++] = k;
        }

        // vargu.length = 5;
        // vargu={k1,k2,k3,k4,k5};
        // index = 5;
    }

    public void shtypPaisjet() {
        for (int i = 0; i < index; i++) {
            System.out.println(vargu[i]);
        }
    }

    public static void main(String[] args) {
        KopshtiZoologjik kz1 = new KopshtiZoologjik("Bota e kafshëve", "Shkup", 8);

        Kafsha k1 = new Kafsha("Luan", "Kafsha 1", 12);
        Kafsha k2 = new Kafsha("Bretkoca", "Kafsha 2", 1);
        Kafsha k3 = new Kafsha("Tiger", "Kafsha 3", 8);
        Kafsha k4 = new Kafsha("Leopard", "Kafsha 4", 5);
        Kafsha k5 = new Kafsha("Krokodil", "Kafsha 5", 7);
        Kafsha k6 = new Kafsha("Papagall", "Kafsha 6", 15);
        Kafsha k7 = new Kafsha("Zog", "Kafsha 7", 18);
        Kafsha k8 = new Kafsha("Qene", "Kafsha 8", 97);
        Kafsha k9 = new Kafsha("Gjirafe", "Kafsha 9", 46);

        kz1.shtoPaisjen(k1);
        kz1.shtoPaisjen(k2);
        kz1.shtoPaisjen(k3);
        kz1.shtoPaisjen(k4);
        kz1.shtoPaisjen(k5);
        kz1.shtoPaisjen(k6);
        kz1.shtoPaisjen(k7);
        kz1.shtoPaisjen(k8);
        kz1.shtoPaisjen(k9);

        Kafsha kafshaTest = new Kafsha("Maca", "Ico", 12);

        System.out.println(kz1.ekziston(kafshaTest));

        System.out.println("Numri i kafsheve ne kopshtin zoologjik : " + kz1.vargu.length);
        kz1.shtypPaisjet();

    }

}
