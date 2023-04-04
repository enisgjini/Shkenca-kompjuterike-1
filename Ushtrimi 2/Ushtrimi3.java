
import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri, count = 0, count10_20 = 0, count45_55 = 0;
        System.out.println("Shtyp numra te plote. Shtyp -9999 per te perfunduar.");
        do {
            numri = input.nextInt();
            if (numri >= 10 && numri <= 20) {
                count10_20++;
            } else if (numri >= 45 && numri <= 55) {
                count45_55++;
            }
            count++;
        } while (numri != -9999);
        count--; // heqim SENTINEL nga numri i numrave shtypur
        System.out.println("Numrat e shtypur gjithsej: " + count);
        System.out.println("Numrat mes 10 dhe 20: " + count10_20);
        System.out.println("Numrat mes 45 dhe 55: " + count45_55);
    }
}