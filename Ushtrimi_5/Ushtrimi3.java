package Ushtrimi_5;

import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numri;
        int numratCift = 0;
        int numratTotal = 0;

        do {
            System.out.print("Shtyp numrin: ");
            numri = input.nextInt();
            if (numri != -3333) {
                numratTotal++;
                if (numri % 2 == 0) {
                    numratCift++;
                }
            }
        } while (numri != -3333);

        System.out.println("Numrat total: " + numratTotal);
        System.out.println("Numrat cift: " + numratCift);
    }
}