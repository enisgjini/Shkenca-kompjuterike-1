import java.util.Scanner;

public class Ushtrimi_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri, counter = 0, pozitive = 0, cifra3 = 0, cift = 0;

        System.out.println("Shtypni numrat (Shtypni -5555 per te ndaluar):");

        do {
            numri = input.nextInt();
            if (numri != -5555) {
                counter++;
                cift += numri % 2 == 0 ? 1 : 0;
                pozitive += numri > 0 ? 1 : 0;
                cifra3 += numri >= 100 && numri <= 999 ? 1 : 0;
            }
        } while (numri != -5555);

        if (counter == 0) {
            System.out.println("Nuk eshte shtypur asnje numer!");
        } else {
            System.out.println("Jane shtypur gjithsej " + counter + " numra dhe " + cift + " prej tyre jane cift, "
                    + pozitive + " prej tyre jane pozitive dhe " + cifra3 + " prej tyre jane 3 shifrore.");
        }
    }
}