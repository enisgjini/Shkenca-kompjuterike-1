import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri, tek = 0, neg = 0, plot = 0, count = 0;
        System.out.println(
                "Udhëzon shfrytëzuesin të shtyp numra të plotë 32-bit dhe e informon se numri -5555 (SENTINEL) e terminon loop dhe nuk përfshihet në kalkulim.");
        do {
            System.out.print("Shtyp numrin: ");
            numri = input.nextInt();
            if (numri == -5555) {
                break;
            }
            count++;
            if (numri % 2 == 1) {
                tek++;
            }
            if (numri < 0) {
                neg++;
            }
            if (numri % 7 == 0) {
                plot++;
            }
        } while (numri != -5555);
        if (count == 0) {
            System.out.println("Nuk eshte shtypur asnje numer!");
        } else {
            System.out.println("Jane shtypur gjithsej " + count + " numra dhe " + tek + " prej tyre jane tek, " + neg
                    + " jane negativ dhe " + plot + " jane te plotepjestueshem me 7.");
        }
    }
}