package Ushtrimi_7;


import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri = 0;
        while (numri < 10) {
            System.out.print("Shkruani numrin e fjaleve/fjalive (duhet te jete me shume se 10): ");
            numri = input.nextInt();
        }
        String[] vargu = new String[numri];
        input.nextLine();
        for (int i = 0; i < vargu.length; i++) {
            System.out.print("Shkruani fjalen/fjalin e " + (i + 1) + "-te: ");
            vargu[i] = input.nextLine();
        }
        int[] rezultati = findTextLengths(vargu);
        System.out
                .println("Jane shtypur gjithsej " + numri + " fjale/fjali dhe " + rezultati[0] + " ishin te zbrazeta, "
                        + rezultati[1] + " kishin gjatesine tek dhe " + rezultati[2] + " kishin gjatesine cift.");
    }

    public static int[] findTextLengths(String[] vargu) {
        int[] rezultati = new int[3];
        int fjaliZbrazet = 0;
        int gjatesiaTek = 0;
        int gjatesiaCift = 0;
        int countCift = 0;
        int countTek = 0;
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i].isEmpty()) {
                fjaliZbrazet++;
            } else if (vargu[i].length() % 2 == 0) {
                gjatesiaCift += vargu[i].length();
                countCift++;
            } else {
                gjatesiaTek += vargu[i].length();
                countTek++;
            }
        }
        rezultati[0] = fjaliZbrazet;
        rezultati[1] = countCift;
        rezultati[2] = countTek;
        return rezultati;
    }
}