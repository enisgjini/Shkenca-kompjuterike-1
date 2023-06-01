public class Restauranti {
    String emri;
    Kamarieri[] vargu;
    int index = 0;

    public Restauranti(String e, int nrKamariereve) {
        emri = e;
        vargu = new Kamarieri[nrKamariereve];
    }

    public boolean ekziston(Kamarieri k) {
        for (int i = 0; i < index; i++) {
            if (k.equals(vargu[i])) {
                return true;
            }

        }
        return false;
    }

    public void shtoKamarierin(Kamarieri k) {
        if (k == null) {
            System.out.println("Kamarieri = null!");
            return;
        } else if (ekziston(k)) {
            System.out.println(k + " ekziston ");
        } else if (index >= vargu.length) {
            System.out.println("Nuk ka vend per " + k);
        } else {
            vargu[index++] = k;
        }
    }

    // 0 1 2
    // vargu = {k1-200-100,k2-2002-150,k3-2001-100}
    public Kamarieri kamarieriMeIRi(double paga) {
        Kamarieri kIRi = vargu[0];

        for (int i = 0; i < index; i++) {
            if (vargu[i].getVitiILindjes() > kIRi.getVitiILindjes() && vargu[i].getPagaMujore() == paga) {
                kIRi = vargu[i];
            }
        }
        return kIRi;
    }

    public Kamarieri[] kamarieretOrari(String orari) {
        Kamarieri[] kamOrari;
        int count = 0;

        for (int i = 0; i < index; i++) {
            if ((vargu[i].getOrariPunes()).equals(orari)) {
                count++;
            }

        }

        kamOrari = new Kamarieri[count];
        int pozita = 0;
        for (int i = 0; i < index; i++) {
            if ((vargu[i].getOrariPunes()).equals(orari)) {
                kamOrari[pozita++] = vargu[i];
            }
        }

        return kamOrari;
    }


    public void shtypKamarieretMeE(){
        for (int i = 0;i < index;i++){
            if((vargu[i].getEmri()).startsWith("E")){
                System.out.println(vargu[i]);
            }
        }
    }

    public static void main(String[] args) {
        Restauranti r = new Restauranti("Gresa", 5);
        Kamarieri k1 = new Kamarieri(1, "K1", 2000, "diten", 130.55);
        Kamarieri k2 = new Kamarieri(2, "E1", 2000, "diten", 130.55);
        Kamarieri k3 = new Kamarieri(3, "K2", 2000, "naten", 120.25);
        Kamarieri k4 = new Kamarieri(4, "E2", 1990, "diten", 130.55);

        r.shtoKamarierin(k1);
        r.shtoKamarierin(k2);
        r.shtoKamarierin(k3);
        r.shtoKamarierin(k4);

        System.out.println("Kamarieri me i ri: " + r.kamarieriMeIRi(130.55));
        Kamarieri[] kam = r.kamarieretOrari("naten");
        for (int i = 0; i < kam.length; i++) {
            System.out.println(kam[i]);
        }

        System.out.println("Kamarieret me E: ");
        r.shtypKamarieretMeE();

    }
}