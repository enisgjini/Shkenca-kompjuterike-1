public class Dyqani {
    String emri;
    Paisja[] vargu;
    int index = 0;

    public Dyqani(String e, int nrPaisjeve) {
        emri = e;
        vargu = new Paisja[nrPaisjeve];
    }

    public boolean ekziston(Paisja p) {
        for (int i = 0; i < index; i++) {
            if (p.equals(vargu[i])) {
                return true;
            }
        }
        return false;
    }

    public void shtoPaisjen(Paisja p) {
        if (p == null) {
            System.out.println("Paisja eshte e painicializuar");
        } else if (ekziston(p)) {
            System.out.println(p + " vetem se ekziston!");
        } else if (index == vargu.length) {
            System.out.println("Nuk ka vend per " + p);
        } else {
            vargu[index++] = p;
        }
    }

    public void shtypPaisjet() {
        for (int i = 0; i < index; i++) {
            System.out.println(vargu[i]);
        }
    }

    public Paisja avgMaxVoltazhi() {
        if (index == 0) {
            return null; // Nëse nuk ka asnjë pajisje në dyqan, kthej null
        }

        double mesatarja = 0;
        for (int i = 0; i < index; i++) {
            mesatarja += vargu[i].getVoltazhi();
        }
        mesatarja /= index;

        Paisja paisjaMax = null;
        double maxVoltazhi = 0;
        for (int i = 0; i < index; i++) {
            if (vargu[i].getVoltazhi() > mesatarja && vargu[i].getVoltazhi() > maxVoltazhi) {
                paisjaMax = vargu[i];
                maxVoltazhi = vargu[i].getVoltazhi();
            }
        }

        return paisjaMax;
    }

    public static void main(String[] args) {
        Dyqani d1 = new Dyqani("Neptun", 5);

        Paisja p1 = new Paisja(123, "Apple", 120, 'B');
        Paisja p2 = new Paisja(124, "Samsung", 120, 'B');
        Paisja p3 = new Paisja(125, "Samsung", 120, 'C');
        Paisja p4 = new Paisja(126, "Apple", 120, 'D');
        Paisja p5 = new Paisja(127, "Samsung", 120, 'C');
        Paisja p6 = new Paisja(128, "LG", 120, 'F');

        d1.shtoPaisjen(p1);
        d1.shtoPaisjen(p2);
        d1.shtoPaisjen(p3);
        d1.shtoPaisjen(p4);
        d1.shtoPaisjen(p5);
        d1.shtoPaisjen(p6);

        Paisja paisjaMaxVoltazhi = d1.avgMaxVoltazhi();
        if (paisjaMaxVoltazhi != null) {
            System.out.println("Paisja me voltazhin me te larte se mesatarja: " + paisjaMaxVoltazhi);
        } else {
            System.out.println("Nuk ka paisje ne dyqan.");
        }

        System.out.println("Vargu i paisjeve ne dyqanin: " + d1.emri);
        d1.shtypPaisjet();
    }
}
