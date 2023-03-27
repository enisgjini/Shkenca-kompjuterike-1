package Ushtrimi_5;

import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numra = 0;
       
        int count = 0;
        do {
            System.out.println("Shtyp një numër të plotë (shtyp -5555 për të mbyllur): ");
            numra = sc.nextInt();
            if (numra != -5555) {
                
                count++;
            }
        } while (numra != -5555);

        System.out.println("U shtypën " + count + " numra");
    }
}