package Ushtrimi_7;

import java.util.Scanner;

public class Ushtrimi6 {
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
        int[] rezultati = findText(vargu);
        System.out
                .println("Jane shtypur gjithsej " + numri + " fjale/fjali dhe " + rezultati[0]
                        + " prej tyre kishin nga 5 ose më shumë fjalë");
    }

    public static int[] findText(String[] vargu) {
        int[] rezultati = new int[1];
        int meShumeSe5 = 0;

        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i].length() > 5) {
                meShumeSe5++;
            }

        }
        rezultati[0] = meShumeSe5;
        return rezultati;
    }
}