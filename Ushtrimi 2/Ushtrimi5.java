import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String SENTINEL = "END";
        int totalFjali = 0;
        int totalFjaliMeF = 0;
        String fjalia;
        do {
            System.out.println("Shtypni fjali (shtypni END për të mbyllur programin): ");
            fjalia = input.nextLine();
            totalFjali++;

            // Ky kod eshte i shkruar nga unë
            if (fjalia.startsWith("F") && fjalia.length() > 5) {
                totalFjaliMeF++;
            }

            // Kolegja e ka shkruar këtë kod, por nuk e di a është i saktë
            // if (fjalia.charAt(0) == 'F' && fjalia.length() > 5) {
            // totalFjaliMeF++;
            // }
        } while (!fjalia.equals(SENTINEL));
        if (totalFjaliMeF == 0) {
            System.out.println("Asnjë nga fjalitë e shtypura nuk e plotësojnë kushtin.");
        } else {
            System.out.println("Numri i fjalive të shtypura: " + (totalFjali - 1));
            System.out.println(
                    "Numri i fjalive që fillon me s hkronjën F dhe janë më të gjata se 5 karaktere: " + totalFjaliMeF);
        }
        input.close();
    }
}