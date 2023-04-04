import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia = "";
        int numriFjalive = 0;
        int numriFjaliveMeShkronjenB = 0;

        while (!fjalia.equals("SENTINEL") && !fjalia.equals("END")) {
            System.out.print("Shtypni nje fjali (ose SENTINEL per te perfunduar): ");
            fjalia = input.nextLine();

            if (!fjalia.equals("SENTINEL") && !fjalia.equals("END")) {
                numriFjalive++;

                int gjatesiaFjales = 0;
                boolean shkronjaB = false;
                for (int i = 0; i < fjalia.length(); i++) {
                    char karakteri = fjalia.charAt(i);
                    if (karakteri == ' ') {
                        if (shkronjaB && gjatesiaFjales % 2 == 0) {
                            numriFjaliveMeShkronjenB++;
                        }
                        gjatesiaFjales = 0;
                        shkronjaB = false;
                    } else {
                        gjatesiaFjales++;
                        if (karakteri == 'B') {
                            shkronjaB = true;
                        }
                    }
                }
                if (shkronjaB && gjatesiaFjales % 2 == 0) {
                    numriFjaliveMeShkronjenB++;
                }
            }
        }

        System.out.println("Numri i fjalive te shtypura eshte: " + numriFjalive);
        System.out.println("Numri i fjalive me shkronjen B dhe gjatesine cift eshte: " + numriFjaliveMeShkronjenB);
    }
}