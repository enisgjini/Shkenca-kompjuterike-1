import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nr = 0;

        while (nr < 5) {
            System.out.print("Shtyp numrin e fjaleve/fjalive (minimumi është 5): ");
            nr = input.nextInt();
        }

        int[] varguINumrave = new int[nr];
        for (int i = 0; i < nr; i++) {
            System.out.print("Shtyp numra : ");
            varguINumrave[i] = input.nextInt();
        }

        System.out.println("------------------------------------");
        System.out.println("Totali i numrave eshte: " + totalNumbers(varguINumrave));
        System.out.println("Mesatarja e numrave eshte: " + averageNumbers(varguINumrave));

        System.out.println("Jane shtypur gjithsej " + nr + " numra,shuma e numrave te shtypur eshte: "
                + totalNumbers(varguINumrave) + " ndersa mesatarja: " + averageNumbers(varguINumrave));
    }

    public static int totalNumbers(int[] varguINumrave) {
        int total = 0;
        for (int i = 0; i < varguINumrave.length; i++) {
            total = varguINumrave[i] + total;
        }
        return total;
    }

    public static int averageNumbers(int[] varguINumrave) {
        int total = 0;
        for (int i = 0; i < varguINumrave.length; i++) {
            total = varguINumrave[i] + total;
        }
        return total / varguINumrave.length;
    }
}