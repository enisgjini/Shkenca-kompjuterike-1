import java.util.Scanner;

public class Ushtrimi8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia = "";
        int numriFjalive = 0;
        while (true) {
            System.out.println("Shkruani fjalinë tuaj: ");
            fjalia = input.nextLine();
            if (fjalia.contains("CSE")) {
                numriFjalive++;
            }
            if (fjalia.equals("SENTINEL") || fjalia.equals("EXIT")) {
                break;
            }
        }
        System.out.println("Numri i fjalive që përmbajnë CSE: " + numriFjalive);
    }
}