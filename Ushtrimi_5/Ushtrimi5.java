package Ushtrimi_5;

import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri = 0;
        int totalNumra = 0;
        int tek = 0;
        int negativ = 0;
        int plotpjestueshem = 0;

        System.out.println("Numri -1111 e terminon programin.");
        do {
            System.out.print("Jepni nje numer: ");
            numri = input.nextInt();
            if (numri != -1111) {
                totalNumra++;
                if (numri % 7 == 0) {
                    plotpjestueshem++;
                }
                if (numri > 0) {
                    tek++;
                } else if (numri < 0) {
                    negativ++;
                }
            }
        } while (numri != -1111);
        if (totalNumra == 0) {
            System.out.println("Nuk eshte shtypur asnje numer!");
        } else {
            System.out.println("Jane shtypur gjithsej " + totalNumra + " numra");
            System.out.println(tek + " prej tyre jane te plote");
            System.out.println(negativ + " prej tyre jane negative");
            System.out.println(plotpjestueshem + " prej tyre jane te plotpjestueshem me 7");
        }
    }
}