import java.util.Scanner;

public class Ushtrimi2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int numri;
int count = 0;
int countSmallAndOdd = 0;

    do {
        System.out.print("Shkruaj numrin: ");
        numri = input.nextInt();

        if(numri != -9999) {
            count++;

            if(numri < 10 && numri % 2 != 0) {
                countSmallAndOdd++;
            }
        }
    } while(numri != -9999);

    System.out.println("Numrat e shtypur gjithsej: " + count);
    System.out.println("Numrat tek dhe me te vegjel se 10: " + countSmallAndOdd);
}
}