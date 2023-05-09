import java.util.Scanner;

public class Ushtrimi_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String str = "";

        System.out.println("Shtypni fjali (per te perfunduar, shtypni SENTINEL ose EXIT): ");

        while(!str.equals("SENTINEL") && !str.equals("EXIT")){
            str = input.nextLine();

            if(str.contains("CSE")){
                count++;
            }
        }

        System.out.println("Numri i fjaleve qe permbajne CSE: " + count);

        input.close();
    }

}