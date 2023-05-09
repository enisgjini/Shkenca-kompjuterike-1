import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numri;
        do {
            System.out.print("Shtypni numrin e numrave (duhet te jete >= 15): ");
            numri = sc.nextInt();
        } while (numri < 15);

        int countTotal = 0;
        long[] vargu = new long[numri];
        for (int i = 0; i < vargu.length; i++) {
            countTotal++;
            System.out.print("Shtypni numrin ");
            vargu[i] = sc.nextLong();
        }
        double metoda = countNumbers(vargu);
        System.out.println("Jane shtypur gjithsej " + numri
                + " numra dhe mesatarja e numrave me te vegjel se 20 eshte: " + metoda);
    }

    public static double countNumbers(long[] vargu) {
        long shuma = 0;
        long countKushti = 0;
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] < 20) {
                countKushti++;
                shuma = shuma + vargu[i];
            }

        }
        double mesatarja = (double) shuma / countKushti;
        return mesatarja;
    }
}