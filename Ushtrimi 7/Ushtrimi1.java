import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Shtyp nje numer se paku 5: ");
        int numri = sc.nextInt();

        while (numri < 5) {
            System.out.print("Shtyp nje numer se paku 5: ");
            numri = sc.nextInt();
        }

        int[] vargu = new int[numri];
        for (int i = 0; i < vargu.length; i++) {
            System.out.print("Shkruani elementin " + (i + 1) + " te vargut: ");
            vargu[i] = sc.nextInt();
        }


        int nr1 = findNumbers(vargu)[0];
        int nr3 = findNumbers(vargu)[1];
        int nrFundit = findNumbers(vargu)[2];
        System.out.println("Jane shtypur gjithsej " + numri + " numra, numri i pare " + nr1 + ", numri i trete " + nr3
                + ", numri i fundit " + nrFundit + ".");

    }

    public static int[] findNumbers(int[] vargu) {
        int[] numrat = new int[3];
        numrat[0] = vargu[0];
        numrat[1] = vargu[2];
        numrat[2] = vargu[vargu.length - 1];
        return numrat;
    }
}