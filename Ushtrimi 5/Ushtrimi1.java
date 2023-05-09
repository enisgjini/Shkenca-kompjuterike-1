import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruaj numrin e elementeve te vargut (se paku 5): ");
        int numri = sc.nextInt();
        while (numri < 5) {
            System.out.print("Ju lutem shkruani nje numer te barabarte ose me te madh se 5: ");
            numri = sc.nextInt();
        }

        int[] vargu = new int[numri];
        for (int i = 0; i < vargu.length; i++) {
            System.out.print("Shkruaj nje numer: ");
            vargu[i] = sc.nextInt();
        }
        double perqindja = calculateNumbers(vargu);
        System.out
                .println("Jane shtypur gjithsej: " + numri + " numra, " + perqindja + "% e te cileve ishin numra tek.");

    }

    public static double calculateNumbers(int[] vargu) {
        int countTek = 0;
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] % 2 != 0) {
                countTek++;
            }
        }
        return (double) countTek * 100 / vargu.length;
    }
}