package Ushtrimi_5;

import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numri;
        int numratTek = 0;
        int numratTotal = 0;

        do {
            System.out.print("Shtyp numrin: ");
            numri = input.nextInt();
            if (numri != -9999) {
                numratTotal++;
                if (numri % 2 == 1) {
                    numratTek++;
                }
            }
        } while (numri != -9999);

        System.out.println("Numrat total: " + numratTotal);
        System.out.println("Numrat tek: " + numratTek);
    }
}