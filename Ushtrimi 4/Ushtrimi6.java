import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numWords;
        do {
            System.out.print("Shtypni numrin e fjaleve/fjalive: ");
            numWords = input.nextInt();
        } while (numWords < 9);
        input.nextLine(); // pastron inputin
        
        int countTotal = 0;
        int countQuestionsOrExclamations = 0;
        for (int i = 1; i <= numWords; i++) {
            System.out.print("Shtypni fjalen/fjalinë nr. " + i + ": ");
            String word = input.nextLine();
            countTotal++;
            if (checkStringType(word)) {
                countQuestionsOrExclamations++;
            }
        }
        System.out.println("Jane shtypur gjithsej " + countTotal + " fjale/fjali dhe " + countQuestionsOrExclamations + " prej tyre janë fjali pyetësore (?) apo habitore (!).");
    }
    
    public static boolean checkStringType(String str) {
        int len = str.length();
        if (len == 0) {
            return false;
        }
        char lastChar = str.charAt(len - 1);
        return lastChar == '?' || lastChar == '!';
    }
}
