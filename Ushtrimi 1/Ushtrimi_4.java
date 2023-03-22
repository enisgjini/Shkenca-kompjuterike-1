
import java.util.Scanner;

public class Ushtrimi_4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nrPare, numPozitiv, numCift, numTreshifror, counter;

        nrPare = 0;
        numPozitiv = 0;
        numCift = 0;
        numTreshifror = 0;
        counter = 0;

        System.out.println("Ju lutem, shkruani numra te plote 32-bit. Numri -5555 eshte sentinel (perfundim)");

        while (nrPare != -5555) {
            nrPare = in.nextInt();
            counter++;

            if (nrPare > 0) {
                numPozitiv++;
            }

            if (nrPare % 2 == 0) {
                numCift++;
            }

            if (nrPare > 99 && nrPare < 999) {
                numTreshifror++;
            }
        }

        if (counter > 1) {
            System.out.println("Jane shtypur gjithsej " + (counter - 1) + " numra dhe " + numCift
                    + " prej tyre kane qene cift, " + numPozitiv + " prej tyre kane qene pozitiv dhe " + numTreshifror
                    + " prej tyre kane qene numra tre-shifror.");
        } else {
            System.out.println("Nuk eshte shtypur asnje numer!");
        }
    }
}