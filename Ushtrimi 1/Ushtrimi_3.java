import java.util.Scanner;

public class Ushtrimi_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri, count = 0, shumefish2 = 0, shumefish4 = 0;
        do {
            System.out.print("Shkruani numrin: ");
            numri = input.nextInt();
            if (numri != -9999) {
                count++;
                if (numri % 2 == 0 && numri % 4 != 0) {
                    shumefish2++;
                }
            }
        } while (numri != -9999);
        System.out.println("Numrat e shtypur: " + count);
        System.out.println("Numrat shumëfish 2 por jo shumëfish 4: " + shumefish2);
    }
}