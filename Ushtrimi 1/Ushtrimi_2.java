import java.util.Scanner;

public class Ushtrimi_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri, count = 0, cifte = 0, zero = 0;
        do {
            System.out.print("Shkruani numrin: ");
            numri = input.nextInt();
            if (numri != -9999) {
                count++;
                if (numri == 0) {
                    zero++;
                } else if (numri % 2 == 0) {
                    cifte++;
                }
            }
        } while (numri != -9999);
        System.out.println("Numrat e shtypur: " + count);
        System.out.println("Numrat tek: " + (count - cifte - zero));
        System.out.println("Numrat çift: " + cifte);
        System.out.println("Numrat 0: " + zero);
    }
}