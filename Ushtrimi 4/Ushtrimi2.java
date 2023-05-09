import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Shkruani numra [së paku 6]: ");
            n = scanner.nextInt();
            scanner.nextLine();
        } while (n < 6);
        String fjalia;
        String fjaliaGjate = "";

        int indexFjaliaGjate = -1;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (counter >= 1 && counter <= 3) {
                System.out.print("Shkruani fjalën/fjalitë e " + (i + 1) + ": ");
                fjalia = scanner.nextLine();
                fjaliaGjate = krahasoFjalite(fjalia, fjaliaGjate);
                if (fjalia.equals(fjaliaGjate)) {
                    indexFjaliaGjate = i;
                }
            } else {
                scanner.nextLine();
            }
            counter++;
        }
        System.out.println("Fjalia më e gjatë ndodhet në pozicionin " + (indexFjaliaGjate + 1));
    }

    public static String krahasoFjalite(String f1, String f2) {
        if (f1.length() > f2.length()) {
            return f1;
        } else {
            return f2;
        }
    }
}


