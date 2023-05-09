import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr;

        do {
            System.out.println("Shtypni nje numer (se paku 10): ");
            nr = sc.nextInt();
        } while (nr < 10);

        String[] vargu = new String[nr];
        sc.nextLine();
        for (int i = 0; i < vargu.length; i++) {
            System.out.println("Shtypni nje fjale/fjali: ");
            vargu[i] = sc.nextLine();
        }

        int countKushti = numeroNumrat(vargu);
        System.out.println(
                "Jane shtypur gjithsej " + nr + " fjale/fjali dhe " + countKushti + " prej tyre kishin vetëm 2 numra");
    }

    public static int numeroNumrat(String[] v) {
        int countMeDyNumra = 0;

        for (int i = 0; i < v.length; i++) {
            int countNumrat = 0;
            for (int j = 0; j < v[i].length(); j++) {
                if (Character.isDigit(v[i].charAt(j))) {
                    countNumrat++;
                }
            }

            if (countNumrat == 2) {
                countMeDyNumra++;
            }
        }

        return countMeDyNumra;
    }
}
