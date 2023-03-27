package Ushtrimi_5;

import java.util.Scanner;

public class Ushtrimi7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia;
        int numriFjalive = 0;

        do {
            System.out.print("Shtyp një fjali: ");
            fjalia = input.nextLine();

            if (fjalia.endsWith("A") || fjalia.endsWith("a")) {
                numriFjalive++;
            }

        } while (!fjalia.equalsIgnoreCase("SENTINEL") && !fjalia.equalsIgnoreCase("EXIT"));

        System.out.println("Numri i fjalive që përfundojnë me shkronjën A është: " + numriFjalive);
    }
}