import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shkruaj nje numer (mes 4 dhe 10): ");
        int numri = sc.nextInt();

        while (numri > 4 && numri < 10) {
            System.out.println("Shkruaj nje numer (mes 4 dhe 10): ");
            numri = sc.nextInt();
        }

        int countInterval = 0;

        for (int i = 0; i < numri; i++) {
            System.out.println("Shkruaj nje numer te plote: ");
            int nr = sc.nextInt();

            if (
                pozitivInterval(nr)
                
            ) {
                countInterval++;
            }
        }

        System.out.println("Gjithsej jane shtypur " + numri + " dhe prej tyre " + countInterval + " e plotsojne kushtin");

    }

    public static boolean pozitivInterval(int n) {

        return ((n > 10 && n < 20) || (n > 40 && n < 50)) ? true : false;

    }
}