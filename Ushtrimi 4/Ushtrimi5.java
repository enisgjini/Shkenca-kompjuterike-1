import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numWords;
        int count = 0;
        int numWordsDivisibleBy5 = 0;

        do {
            System.out.print("Shkruaj numrin e fjaleve/fjalive (paku 5): ");
            numWords = input.nextInt();
        } while (numWords < 5);

        input.nextLine(); // consume the newline character left by nextInt()

        for (int i = 1; i <= numWords; i++) {
            System.out.print("Shkruaj fjalen/fjalinë " + i + ": ");
            String word = input.nextLine();
            count++;

            if (checkString(word)) {
                numWordsDivisibleBy5++;
            }
        }

        System.out.println("Jane shtypur gjithsej " + count + " fjale/fjali dhe " + numWordsDivisibleBy5 + " prej tyre e plotesojne kushtin.");
    }

    public static boolean checkString(String s) {
        return s.length() % 5 == 0;
    }
}
