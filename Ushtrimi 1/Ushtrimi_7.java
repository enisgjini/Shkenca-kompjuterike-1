import java.util.Scanner;

public class Ushtrimi_7 {
    public static void main(String[] args) {
        String fjala = "test";
        String input = "";
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Shtypni nje varg fjalesh ose fjali.");
        System.out.println("Shtypni SENTINEL ose END per te perfunduar.");

        for (int i = 0; i < fjala.length(); i++) {
            System.out.print((int) fjala.charAt(i) + " ");
        }
        System.out.println();

        while (!input.equalsIgnoreCase("SENTINEL") && !input.equalsIgnoreCase("END")) {
            input = sc.nextLine().toLowerCase();
            for (int i = 0; i < input.length(); i++) {
                System.out.print((int) input.charAt(i) + " ");
            }
            System.out.println();
            if (input.compareTo(fjala) > 0) {
                counter++;
            }
        }

        System.out.println("Numri i fjaleve/fjalive me te gjate se " + fjala + " eshte: " + counter);
    }
}