import java.util.Scanner;

public class Ushtrimi7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia = "";
        int numriFjalive = 0;
        while (true) {
            System.out.println("Shkruani fjalinë tuaj: ");
            fjalia = input.nextLine();
            if (fjalia.endsWith("A") || fjalia.endsWith("a")) {
                numriFjalive++;
            }
            if (fjalia.equals("SENTINEL") || fjalia.equals("END")) {
                break;
            }
        }
        System.out.println("Numri i fjalive që përfundojnë me A: " + numriFjalive);
    }
}