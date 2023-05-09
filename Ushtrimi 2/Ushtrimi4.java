import java.util.Scanner;
public class Ushtrimi4 {
    public static void main(String[] args) {
        int numri, numratShtypur = 0, numriMax = Integer.MIN_VALUE;
        do {
            System.out.print("Shtypni nje numer te plote (-9999 per te perfunduar): ");
            numri = new Scanner(System.in).nextInt();
            if (numri != -9999) {
                numratShtypur++;
                if (numri > numriMax) {
                    numriMax = numri;
                }
            }
        } while (numri != -9999);
        System.out.println("Numrat e shtypur gjithsej: " + numratShtypur);
        System.out.println("Numri me i madh i shtypur: " + numriMax);
    }
}