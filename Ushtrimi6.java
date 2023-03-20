import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia = "";
        int numriFjalive = 0;
        while (true) {
            System.out.println("Shkruani fjalinë tuaj: ");
            fjalia = input.nextLine();
            if (fjalia.equals("SENTINEL") || fjalia.equals("EXIT")) {
                break;
            }
            numriFjalive += fjalia.split(" ").length;
        }
        System.out.println("Numri i fjalive: " + numriFjalive);
    }
}