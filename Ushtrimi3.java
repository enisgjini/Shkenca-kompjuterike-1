
import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri, count = 0, cift = 0;
        System.out.println("Shtyp numra te plote. Numri -7777 (SENTINEL) e terminon loop dhe nuk perfshihet ne kalkulim");
        numri = input.nextInt();
        while (numri != -7777) {
            count++;
            if (numri % 2 == 0) {
                cift++;
            }
            numri = input.nextInt();
        }
        System.out.println("Numrat e shtypur gjithsej: " + count);
        System.out.println("Numrat cift: " + cift);
    }
}