package Ushtrimi_5;

import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numri;
        int count = 0;
        int shumefishet = 0;
        String shumefishNumbers = "";
        System.out.println("Numri -7777 e terminon programin.");

        do {

            System.out.print("Shkruaj numrin: ");
            numri = input.nextInt();

            if (numri != -7777) {
                count++;

                if (numri % 4 == 0 && numri % 8 == 0) {
                    shumefishet++;
                    shumefishNumbers += numri + " ";
                }
            }

        } while (numri != -7777);

        System.out.println("\nGjithsej janë shtypur " + count + " numra.");
        System.out.println("Nga këta numra " + shumefishet + " ishin shumëfishi i 4 dhe 8.");
        System.out.println("Këta janë numrat shumëfish: " + shumefishNumbers);
    }
}