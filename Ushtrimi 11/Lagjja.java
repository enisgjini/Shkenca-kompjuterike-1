public class Lagjja {
    public String emri;
    public Banesa[] banesat;
    int index = 0;

    public Lagjja(String e, int nrB) {
        emri = e;
        banesat = new Banesa[nrB];
    }

    public void shtoBanesen(Banesa b) {
        if (b == null) {
            System.out.println("Banesa = null!");
            return;
        }

        for (int i = 0; i < index; i++) {
            if (b.equals(banesat[i])) {
                System.out.println(b + " vetem se ekziston");
                return;
            }
        }

        if (index == banesat.length) {
            System.out.println("Nuk ka vend per te shtuar " + b);
            return;
        }

        banesat[index++] = b;
    }

    public Banesa banesaMeEVjeter(String stili) {
        Banesa bVjeter = banesat[0];
        double avg = 0;
        int count = 0;

        for (int i = 0; i < index; i++) {
            if (banesat[i].getStiliArkitektonik().equals(stili)) {
                avg = avg + banesat[i].getVitiINdertimit();
                count++;
            }
        }

        avg = avg / count;

        for (int i = 0; i < index; i++) {
            if (banesat[i].getStiliArkitektonik().equals(stili) && banesat[i].getVitiINdertimit() < avg) {
                bVjeter = banesat[i];
            }
        }

        return bVjeter;
    }

    public Banesa[] banesatEGjelbra() {
        Banesa mePakKate = null;
        Banesa meShumeKate = null;

        for (int i = 0; i < index; i++) {
            if (banesat[i].getNgjyra().equals("e gjelber")) {
                if (mePakKate == null || banesat[i].getNrKateve() <= mePakKate.getNrKateve()
                        || !mePakKate.getNgjyra().equals("e gjelber")) {
                    mePakKate = banesat[i];
                }
            }

            if (meShumeKate == null || banesat[i].getNrKateve() >= meShumeKate.getNrKateve()
                    || !meShumeKate.getNgjyra().equals("e gjelber")) {
                meShumeKate = banesat[i];
            }
        }

        Banesa[] v = { mePakKate, meShumeKate };
        return v;
    }

    public void fshijBanesen(Banesa b) {
        for (int i = 0; i < index; i++) {
            if (b.equals(banesat[i])) {
                for (int j = i; j < index - 1; j++) {
                    banesat[j] = banesat[j + 1];
                }

                banesat[--index] = null;
                i--;
            }
        }
    }

    public void shtypBanesatEVitit(int viti) {
        for (int i = 0; i < index; i++) {
            if (banesat[i].getVitiINdertimit() == viti) {
                System.out.println(banesat[i]);
            }
        }
    }

    public void shtypBanesat() {
        for (int i = 0; i < index; i++) {
            System.out.println(banesat[i]);
        }
    }

    public static void main(String[] args) {
        Lagjja l = new Lagjja("Dardania", 10);

        Banesa b1 = new Banesa(1, 10, "e kuqe", "modern", 2000);
        Banesa b2 = new Banesa(2, 9, "e gjelber", "modern", 2000);
        Banesa b3 = new Banesa(3, 3, "e gjelber", "modern", 1998);
        Banesa b4 = new Banesa(4, 9, "e gjelber", "antik", 2000);
        l.shtoBanesen(b1);
        l.shtoBanesen(b2);
        l.shtoBanesen(b3);
        l.shtoBanesen(b4);

        l.shtypBanesat();

        System.out.println("=================== Banesa Me e Vjeter");
        System.out.println(l.banesaMeEVjeter("modern"));

        System.out.println("=================== Banesat e gjelbra");
        Banesa[] v = l.banesatEGjelbra();
        for (Banesa b : v) {
            System.out.println(b);
        }

        System.out.println("=================== shtypBanesatEVtiti");
        l.shtypBanesatEVitit(2000);

        System.out.println("================ Fshij");
        l.fshijBanesen(b1);
        l.fshijBanesen(b3);

        l.shtypBanesat();
    }
}
