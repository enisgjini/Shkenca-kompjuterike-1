
import java.util.Scanner;

public class Ushtrimi_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Shtypni fjalë ose shprehje derisa shtypni SENTINEL");
        String SENTINEL = "end";
        String input = sc.next();
        while (!input.equals("SENTINEL")) {
            if (input.startsWith("A") || input.startsWith("D") || input.endsWith("B") || input.endsWith("E")) {
                counter++;
            }
            input = sc.next();
        }
        System.out.println("Numri i fjalëve që përfundojnë me B ose fillojnë me A ose D është " + counter);
    }
}