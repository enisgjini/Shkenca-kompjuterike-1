import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        do {
            System.out.print("Shkruani numrin: ");
            num = sc.nextInt();
        } while (num < 10);

        sc.nextLine();
        String str = "";
        int countINterval = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Shkruani fjalin: ");
            str = sc.nextLine();
            if (findWord(str)) {
                countINterval++;
            }
        }

        System.out.println("Gjithsej jane shtypur " + num + " dhe prej tyre " + countINterval + " e plotsojne kushtin");

    }

    public static boolean findWord(String str) {
        boolean end = str.toLowerCase().endsWith("java") || str.toLowerCase().endsWith("shkenca");
        boolean start = str.startsWith("ubt");

        if (end && start) {
            return true;
        } else {
            return false;

        }

    }
}