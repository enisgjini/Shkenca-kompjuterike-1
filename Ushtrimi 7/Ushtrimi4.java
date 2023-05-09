package Ushtrimi_7;


import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numri = sc.nextInt();

        while (numri < 10) {
            System.out.print("Shtyp nje numer se paku 10:");
            numri = sc.nextInt();

        }

        String[] vargu = new String[numri];
        sc.nextLine();

        for (int i = 0; i < vargu.length; i++) {
            System.out.println("Shtyp nje fjale/fjali:");
            vargu[i] = sc.nextLine();
        }

        

    }
}