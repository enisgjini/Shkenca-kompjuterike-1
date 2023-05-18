public class Kafsha {
    String lloji; // Ky atribut duhet te jete
    String emri;
    int mosha;

    public Kafsha(String llojiKafshes, String emriKafshes, int mosha) {
        lloji = llojiKafshes;
        emri = emriKafshes;
        this.mosha = mosha;
    }

    // Merre numrin e targave
    public String getllojiKafshes() {
        return lloji;
    }

    // Merre modelin e vetures
    public String getemriKafshes() {
        return emri;
    }

    // Merre vitin e prodhimit
    public int getMosha() {
        return mosha;
    }

    public void setEmri(String m) {
        emri = m;
    }

    public void setMosha(int viti) {
        mosha = viti;
    }

    public String toString() {
        return lloji + " - " + emri + " ka moshen " + mosha;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Kafsha) {
            Kafsha kafsha = (Kafsha) obj;
            if (kafsha.getllojiKafshes().equals(lloji) && kafsha.getemriKafshes().equals(emri)
                    && kafsha.getMosha() == mosha) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Kafsha kafsha1 = new Kafsha("Gjitare", "Elefent", 10);

        Kafsha kafsha2 = new Kafsha("Gjitare", "Gjirafa", 20);

        Kafsha kafsha3 = new Kafsha("Gjitare", "Luan", 7);

        System.out.println("Kafsha 1");
        System.out.println("Lloji i kafshes: " + kafsha1.getllojiKafshes());
        System.out.println("Emri i kafshes: " + kafsha1.getemriKafshes());
        System.out.println("Mosha: " + kafsha1.getMosha());

        kafsha1.setEmri("Anakond");
        kafsha1.setMosha(2);

        System.out.println(kafsha1.toString());
        System.out.println("Kafsha e 1 vs Kafsha e 2: " + kafsha1.equals(kafsha2));
        System.out.println("Kafsha e 1 vs Kafsha e 3: " + kafsha1.equals(kafsha3));

        System.out.println("------------------------------");

        System.out.println("Kafsha 2: ");
        System.out.println("Lloji i kafshes: " + kafsha2.getllojiKafshes());
        System.out.println("Emri i kafshes: " + kafsha2.getemriKafshes());
        System.out.println("Mosha: " + kafsha2.getMosha());

        kafsha1.setEmri("Drer");
        kafsha1.setMosha(5);

        System.out.println(kafsha2.toString());
        System.out.println("Kafsha e 2 vs Kafsha e 3: " + kafsha2.equals(kafsha3));

        System.out.println("------------------------------");

        System.out.println("Kafsha 3: ");
        System.out.println("Lloji i kafshes: " + kafsha3.getllojiKafshes());
        System.out.println("Emri i kafshes: " + kafsha3.getemriKafshes());
        System.out.println("Mosha: " + kafsha3.getMosha());

        kafsha3.setEmri("Shqiponje");
        kafsha3.setMosha(9);

        System.out.println(kafsha3.toString());
    }
}
