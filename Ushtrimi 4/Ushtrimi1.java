import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri = 0;
        int count = 0;
        while (numri != -9999) {
            System.out.print("Shkruani nje numer te plote: ");
            numri = input.nextInt();
            if (numri != -9999) {
                count++;
            }
        }
        System.out.println("Numrat e shtypur gjithsej: " + count);
    }
}