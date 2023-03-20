import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri = 0;
        int shumefishuesi = 0;
        int count = 0;
        System.out.println("Shtyp numra te plote. Shtyp -9999 per te perfunduar.");
        while (numri != -9999) {
            numri = input.nextInt();
            count++;
            if (numri % 4 == 0 && numri % 8 == 0) {
                shumefishuesi++;
            }
        }
        System.out.println("Numrat e shtypur gjithsej: " + (count - 1));
        System.out.println("Numrat e shtypur qe jane shumefish i 4 dhe 8: " + shumefishuesi);
    }
}