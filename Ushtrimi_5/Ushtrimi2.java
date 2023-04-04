package Ushtrimi_5;

import java.util.Scanner;

//  Forma e parë
// public class Ushtrimi2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int numri;
//         int numratTek = 0;
//         int numratTotal = 0;

//         do {
//             System.out.print("Shtyp numrin: ");
//             numri = input.nextInt();
//             if (numri != -9999) {
//                 numratTotal++;
//                 if (numri % 2 == 1) {
//                     numratTek++;
//                 }
//             }
//         } while (numri != -9999);

//         System.out.println("Numrat total: " + numratTotal);
//         System.out.println("Numrat tek: " + numratTek);
//     }
// }

//  Forma e dytë

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SENTINEL = -9999;
        int countTotali = 0;
        int countKushti = 0;
        int nr;

        do {
            System.out.println("Shtype nje numer (-9999):");
            nr = sc.nextInt();
            if (nr != SENTINEL) {
                countTotali++;
                if (nr % 2 != 0 && nr < 10) {
                    countKushti++;
                }
            }

        } while (nr != SENTINEL);
        System.out.println("Numrat total: " + countTotali + " dhe kushti: " + countKushti);

    }
}