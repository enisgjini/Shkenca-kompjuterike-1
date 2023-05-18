public class Sportisti {
    int id;
    String emri;
    int mosha;
    char gjinia;

    public Sportisti(int s_id, String s_emri, int s_mosha, char s_gjinia) {
        id = s_id;
        emri = s_emri;
        mosha = s_mosha;
        gjinia = s_gjinia;
    }

    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public int getMosha() {
        return mosha;
    }

    public char getGjinia() {
        return gjinia;
    }

    public void setEmri(String emri_sportistit) {
        emri = emri_sportistit;
    }

    public void setMosha(int mosha_sportistit) {
        mosha = mosha_sportistit;
    }

    public void setGjinia(char gjinia_sportistit) {
        gjinia = gjinia_sportistit;
    }

    public String toString() {
        return id + " :  " + emri + " " + gjinia + " " + mosha + " vjeq";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Sportisti) {
            Sportisti sportisti = (Sportisti) obj;
            if (sportisti.getId() == id && sportisti.getMosha() == mosha) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Sportisti sportisti1 = new Sportisti(1, "Dashnor Balaj", 20, 'M');

        Sportisti sportisti2 = new Sportisti(77, "Stivi Frashëri", 33, 'M');

        Sportisti sportisti3 = new Sportisti(92, "Damir Ljuljanovic", 31, 'M');

        System.out.println("Sportisti 1");
        System.out.println("ID-ja sportistit: " + sportisti1.getId());
        System.out.println("Emri i sportistit: " + sportisti1.getEmri());
        System.out.println("Mosha e sportistit: " + sportisti1.getMosha());
        System.out.println("Gjinia e sportistit: " + sportisti1.getGjinia());

        sportisti1.setEmri("Bajram Jashanica");
        sportisti1.setGjinia('M');
        sportisti1.setMosha(33);

        System.out.println(sportisti1.toString());
        System.out.println("Sportisti 1 vs Sportisti 2 : " + sportisti1.equals(sportisti2));
        System.out.println("Sportisti 1 vs Sportisti 3 : " + sportisti1.equals(sportisti3));

        System.out.println("------------------------------");

        System.out.println("Sportisti 2");
        System.out.println("ID-ja sportistit: " + sportisti2.getId());
        System.out.println("Emri i sportistit: " + sportisti2.getEmri());
        System.out.println("Mosha e sportistit: " + sportisti2.getMosha());
        System.out.println("Gjinia e sportistit: " + sportisti2.getGjinia());

        sportisti2.setEmri("Lumbardh Devolla");
        sportisti2.setGjinia('M');
        sportisti2.setMosha(29);

        System.out.println(sportisti2.toString());
        System.out.println("Sportisti 2 vs Sportisti 3: " + sportisti2.equals(sportisti3));

        System.out.println("------------------------------");

        System.out.println("Sportisti 3");
        System.out.println("ID-ja sportistit: " + sportisti3.getId());
        System.out.println("Emri i sportistit: " + sportisti3.getEmri());
        System.out.println("Mosha e sportistit: " + sportisti3.getMosha());
        System.out.println("Gjinia e sportistit: " + sportisti3.getGjinia());

        sportisti3.setEmri("Astirt Thaqi");
        sportisti3.setGjinia('M');
        sportisti3.setMosha(30);

        System.out.println(sportisti3.toString());

    }

}
