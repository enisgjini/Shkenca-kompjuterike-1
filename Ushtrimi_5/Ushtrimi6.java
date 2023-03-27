package Ushtrimi_5;

import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.println("Shtypni fjali (shtypni \"FUND\" për të mbyllur programin):");

        while (true) {
            String fjalia = input.nextLine().toUpperCase();
            if (fjalia.equals("FUND")) {
                break;
            }
            count++;
        }

        System.out.println("Numri i fjaleve të shtypura: " + count);
    }
}