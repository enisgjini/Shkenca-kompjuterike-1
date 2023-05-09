import java.util.Scanner;

public class Ushtrimi7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia;
        int numriFjalive = 0;
        int numriZanoreve = 0;

        do {
            System.out.print("Shtypni nje fjali (ose SENTINEL per te perfunduar): ");
            fjalia = input.nextLine();

            if (!fjalia.equals("SENTINEL") && !fjalia.equals("EXIT")) {
                numriFjalive++;

                if (fjalia.endsWith("a") || fjalia.endsWith("e") || fjalia.endsWith("i") || fjalia.endsWith("o")
                        || fjalia.endsWith("u") || fjalia.endsWith("y") || fjalia.endsWith("ë")) {
                    numriZanoreve++;
                }
            }
        } while (!fjalia.equals("SENTINEL") && !fjalia.equals("EXIT"));

        System.out.println("Numri i fjalive te shtypura eshte: " + numriFjalive);
        System.out.println("Numri i fjalive qe perfundojne me zanore eshte: " + numriZanoreve);
    }
}