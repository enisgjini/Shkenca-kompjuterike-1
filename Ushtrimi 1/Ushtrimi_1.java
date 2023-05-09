import java.util.Scanner;

public class Ushtrimi_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0, between25and30 = 0;
        System.out.println("Shtyp numra. Shtyp -9999 per te ndalur programin");
        num = sc.nextInt();
        final int SENTINEL = -9999;
        while (num != SENTINEL) {
            count++;
            if (num >= 25 && num <= 30) {
                between25and30++;
            }
            num = sc.nextInt();
        }
        System.out
                .println("Ju keni shtypur : " + count + " numra dhe " + between25and30 + " numra jane midis 25 dhe 30");
    }
}