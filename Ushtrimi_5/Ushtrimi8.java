package Ushtrimi_5;

import java.util.Scanner;

public class Ushtrimi8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia;
        int numriFjalive = 0;

        System.out.println("Shtypni \"STOP\" për të mbyllur programin)");

        do {
            System.out.print("Shtypni nje fjali: ");
            fjalia = input.nextLine();

            if (fjalia.contains("SHK")) {
                numriFjalive++;
            }

        } while (!fjalia.equals("STOP"));

        System.out.println("Numri i fjalive qe permbajne SHK: " + numriFjalive);
    }
}