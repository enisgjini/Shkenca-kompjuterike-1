import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = 0; // numri i numrave që do të shtypen
        while (n < 8) { // kërkojmë të shtypet së paku 8 numra
            System.out.print("Shtyp numrin e numrave që dëshiron të shtypësh: ");
            n = input.nextInt();
            if (n < 8) {
                System.out.println("Duhen shtypur së paku 8 numra! Provoni përsëri.");
            }
        }
        
        long[] numrat = new long[n]; // krijojmë një varg me n elemente
        
        for (int i = 0; i < n; i++) { // kërkojmë nga shfrytëzuesi të shtypë numrat
            System.out.print("Shtyp numrin e " + (i+1) + ": ");
            numrat[i] = input.nextLong();
        }
        
        int count = 0; // numri i numrave pozitivë çift në varg
        long minNr = Long.MAX_VALUE; // numri më i vogël pozitiv çift në varg
        for (int i = 0; i < n; i++) {
            if (numrat[i] > 0 && numrat[i] % 2 == 0) { // kontrollojmë nëse numri është pozitiv dhe çift
                count++; // rritim numrin e numrave pozitivë çift
                if (numrat[i] < minNr) { // nëse numri është më i vogël se minNr aktualizojmë minNr
                    minNr = numrat[i];
                }
            }
        }
        
        if (count == 0) { // nëse nuk ka numër pozitiv çift në varg
            System.out.println("Nuk eshte shtypur asnje numer cift pozitiv!");
        } else { // nëse ka numra pozitivë çift në varg
            System.out.println("Jane shtypur gjithsej " + n + " numra dhe " + minNr + " ishte numri me i vogel cift pozitiv.");
        }
        
        input.close(); // mbyllim Scanner-in
    }
}
