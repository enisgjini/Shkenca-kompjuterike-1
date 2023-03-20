import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri = 0;
        int count = 0;
        int tek = 0;
        while (numri != -5555) {
            System.out.print("Shkruani nje numer te plote: ");
            numri = input.nextInt();
            if (numri != -5555) {
                count++;
                if (numri % 2 != 0) {
                    tek++;
                }
            }
        }
        System.out.println("Numrat e shtypur gjithsej: " + count);
        System.out.println("Numrat tek: " + tek);
    }
}