import java.util.Scanner;

public class Ushtrimi1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri;
        int count = 0;
        int countCift = 0;
        int countZero = 0;

        do {
            System.out.print("Shtypni nje numer te plote (-9999 per te perfunduar): ");
            numri = input.nextInt();

            if (numri != -9999) {
                count++;

                if (numri == 0) {
                    countZero++;
                } else if (numri % 2 == 0) {
                    countCift++;
                }
            }
        } while (numri != -9999);

        System.out.println("Numrat e shtypur: " + count);
        System.out.println("Numrat cift: " + countCift);
        System.out.println("Numrat zero: " + countZero);
    }
}